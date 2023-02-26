package com.instruMental.repository;




import com.instruMental.models.Usuario;

public interface UserRepository {
    public Usuario findByName(String name);
}
