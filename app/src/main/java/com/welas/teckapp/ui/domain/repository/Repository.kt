package com.welas.teckapp.ui.domain.repository

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.welas.teckapp.ui.domain.entity.BusinessPartner
import com.welas.teckapp.ui.domain.entity.Category
import com.welas.teckapp.ui.domain.entity.Configuration
import com.welas.teckapp.ui.domain.entity.ExchangeRate
import com.welas.teckapp.ui.domain.entity.Image
import com.welas.teckapp.ui.domain.entity.Invoice
import com.welas.teckapp.ui.domain.entity.InvoiceLine
import com.welas.teckapp.ui.domain.entity.PaymentDetail
import com.welas.teckapp.ui.domain.entity.PaymentMethod
import com.welas.teckapp.ui.domain.entity.Product
import com.welas.teckapp.ui.domain.entity.Serials
import com.welas.teckapp.ui.domain.entity.User
import kotlinx.coroutines.flow.Flow

@Dao
interface Repository {
    //Business Partner

    @Insert
    suspend fun insertBusinessPartner(businessPartner: BusinessPartner)

    @Update
    suspend fun updateBusinessPartner(businessPartner: BusinessPartner)

    @Delete
    suspend fun deleteBusinessPartner(businessPartner: BusinessPartner)

    @Query("select * from businessPartner WHERE isActive = 1 ORDER BY creationDate DESC")
    fun getBusinessPartner(): Flow<List<BusinessPartner>>

    @Query("select * from businessPartner where businessPartnerId =:businessPartnerId")
    suspend fun getBusinessPartnerById(businessPartnerId: Int): BusinessPartner

    @Query("SELECT * FROM businessPartner WHERE isActive = 1  AND (value LIKE '%' || :data OR UPPER(businessName) LIKE '%' || :data) ORDER BY creationDate DESC")
    fun getBusinessPartnerByNameRif(data: String): Flow<List<BusinessPartner>>

    //Category

    @Insert
    suspend fun insertCategory(category: Category)

    @Update
    suspend fun updateCategory(category: Category)

    @Delete
    suspend fun deleteCategory(category: Category)

    @Query("select * from category WHERE isActive = 1 ORDER BY creationDate DESC")
    fun getCategory(): Flow<List<Category>>

    @Query("select * from category where (categoryId =:categoryId)")
    suspend fun getCategoryById(categoryId: Int): Category

    @Query("SELECT * FROM category WHERE isActive = 1 and (description LIKE '%' || :filter || '%') ORDER BY creationDate DESC")
    fun getCategoryByName(filter: String): Flow<List<Category>>

    @Query("SELECT * FROM category WHERE code = :code LIMIT 1")
    suspend fun getCategoryByCode(code: String): Category

    //Configuration

    @Insert
    suspend fun insertConfiguration(configuration: Configuration)

    @Update
    suspend fun updateConfiguration(configuration: Configuration)

    @Delete
    suspend fun deleteConfiguration(configuration: Configuration)

    @Query("select * from configuration where (configurationId =:configurationId)")
    suspend fun getConfigurationById(configurationId: Int): Configuration

    //Exchange rate
    @Insert
    suspend fun insertExchangeRate(exchangeRate: ExchangeRate)

    @Update
    suspend fun updateExchangeRate(exchangeRate: ExchangeRate)

    @Delete
    suspend fun deleteExchangeRate(exchangeRate: ExchangeRate)

    @Query("select * from exchangeRate  WHERE isActive = 1 ORDER BY creationDate DESC")
    fun getExchangeRate(): Flow<List<ExchangeRate>>

    @Query("select * from exchangeRate where exchangeRateId =:exchangeRateId")
    suspend fun getExchangeRateById(exchangeRateId: Int): ExchangeRate

    //Image

    @Insert
    suspend fun insertImage(image: Image)

    @Update
    suspend fun updateImage(image: Image)

    @Delete
    suspend fun deleteImage(image: Image)

    @Query("select * from image")
    fun getImages(): Flow<List<Image>>

    @Query("select * from image where imageId =:imageId")
    suspend fun getImageById(imageId: Int): Image

    //Invoice
    @Insert
    suspend fun insertInvoice(invoice: Invoice)

    @Update
    suspend fun updateInvoice(invoice: Invoice)

    @Delete
    suspend fun deleteInvoice(invoice: Invoice)

    @Query("select * from invoice WHERE isActive = 1 ORDER BY creationDate DESC")
    fun getInvoice(): Flow<List<Invoice>>

    @Query("select * from invoice where invoiceId =:invoiceId")
    suspend fun getInvoiceById(invoiceId: Int): Invoice

    //Invoice line
    @Insert
    suspend fun insertInvoiceLine(invoiceLine: InvoiceLine)

    @Update
    suspend fun updateInvoiceLine(invoiceLine: InvoiceLine)

    @Delete
    suspend fun deleteInvoiceLine(invoiceLine: InvoiceLine)

    @Query("select * from invoiceLine WHERE isActive = 1 ORDER BY creationDate DESC")
    fun getInvoiceLine(): Flow<List<InvoiceLine>>

    @Query("select * from invoiceLine where isActive = 1 and invoiceLineId =:invoiceLineId")
    suspend fun getInvoiceLineById(invoiceLineId: Int): InvoiceLine

    @Query("select * from invoiceLine where invoiceId =:invoiceId")
    fun getInvoiceLineByInvoiceId(invoiceId: Int): Flow<List<InvoiceLine>>

    //Payment detail

    @Insert
    suspend fun insertPaymentDetail(paymentDetail: PaymentDetail)

    @Update
    suspend fun updatePaymentDetail(paymentDetail: PaymentDetail)

    @Delete
    suspend fun deletePaymentDetail(paymentDetail: PaymentDetail)

    @Query("select * from paymentDetail  ORDER BY creationDate DESC")
    fun getPaymentDetail(): Flow<List<PaymentDetail>>

    @Query("select * from paymentDetail where paymentDetailId =:paymentDetailId")
    suspend fun getPaymentDetailById(paymentDetailId: Int): PaymentDetail

    @Query("select * from paymentDetail where invoiceId =:invoiceId")
    fun getPaymentDetailByInvoiceId(invoiceId: Int): Flow<List<PaymentDetail>>

    //Payment method
    @Insert
    suspend fun insertPaymentMethod(paymentMethod: PaymentMethod)

    @Update
    suspend fun updatePaymentMethod(paymentMethod: PaymentMethod)

    @Delete
    suspend fun deletePaymentMethod(paymentMethod: PaymentMethod)

    @Query("select * from paymentMethod WHERE isActive = 1 ORDER BY creationDate DESC")
    fun getPaymentMethod(): Flow<List<PaymentMethod>>

    @Query("select * from paymentMethod where paymentMethodId =:paymentMethodId")
    suspend fun getPaymentMethodById(paymentMethodId: Int): PaymentMethod

    @Query("SELECT * FROM paymentMethod WHERE isActive = 1 and (description LIKE '%' || :filter || '%') ORDER BY creationDate DESC")
    fun getPaymentMethodByName(filter: String): Flow<List<PaymentMethod>>

    //Product

    @Insert
    suspend fun insertProduct(product: Product)

    @Update
    suspend fun updateProduct(product: Product)

    @Delete
    suspend fun deleteProduct(product: Product)

    @Query("select * from product WHERE isActive = 1 ORDER BY creationDate DESC")
    fun getProduct(): Flow<List<Product>>

    @Query("select * from product where productId =:productId")
    suspend fun getProductById(productId: Int): Product

    @Query("SELECT * FROM product WHERE name LIKE '%' || :filter || '%' ORDER BY creationDate DESC")
    fun getFilteredProducts(filter: String): Flow<List<Product>>

    @Query("SELECT * FROM product WHERE isActive = 1 and (code = :code)  LIMIT 1")
    suspend fun getProductByCode(code: String): Product?

    //Serials

    @Insert
    suspend fun insertSerial(serial: Serials)

    @Update
    suspend fun updateSerial(serial: Serials)

    @Delete
    suspend fun deleteSerial(serial: Serials)

    @Query("select * from serials ORDER BY creationDate DESC")
    fun getSerials(): Flow<List<Serials>>

    @Query("select * from serials WHERE isActive = 1 and (itemId = :itemId) ORDER BY creationDate DESC")
    fun getSerialsByItemId(itemId: Int): Flow<List<Serials>>

    //User

    @Insert
    suspend fun insertUser(user: User)

    @Update
    suspend fun updateUser(user: User)

    @Delete
    suspend fun deleteUser(user: User)

    @Query("select * from user where isActive = 1 ORDER BY creationDate DESC")
    fun getUsers(): Flow<List<User>>

    @Query("select * from user where userId =:userId")
    suspend fun getUserById(userId: Int): User

    @Query("select * from user where username =:username")
    suspend fun getUserByUsername(username: String): User

    @Query("SELECT * FROM user WHERE isActive = 1 AND (name LIKE '%' || :filter || '%' ) ORDER BY creationDate DESC")
    fun getUsersByName(filter: String): Flow<List<User>>

    //Validations

    @Query("SELECT EXISTS(SELECT 1 FROM product WHERE code = :code) AS isExist")
    suspend fun validateExistProductCode(code: String): Boolean

    @Query("SELECT EXISTS(SELECT 1 FROM category WHERE code = :code) AS isExist")
    suspend fun validateExistCategoryCode(code: String): Boolean

    @Query("SELECT EXISTS(SELECT 1 FROM serials WHERE serial = :serial) AS isExist")
    suspend fun validateExistSerial(serial: String): Boolean

    @Query("SELECT EXISTS(SELECT 1 FROM businessPartner WHERE value = :value) AS isExist")
    suspend fun validateExistBusinessPartnerValue(value: String): Boolean

    @Query("SELECT EXISTS(SELECT 1 FROM paymentMethod WHERE code = :code) AS isExist")
    suspend fun validateExistPaymentMethodCode(code: String): Boolean

    //Reports
}