package br.com.rectius.contactlist.api

import br.com.rectius.contactlist.model.Contact
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ContactAPI {

    @GET("/api/contacts")
    fun getContacts() : Call<List<Contact>>

    @POST("/api/contacts")
    fun salvar(@Body contact: Contact): Call<Contact>

    /*@GET("/contacts/{id}")
    fun getContacts(@Path("id") id:String)*/
}