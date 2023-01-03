data class Google(override val id: String, override val email: String, override val password: String ): User(id, email, password) {
}