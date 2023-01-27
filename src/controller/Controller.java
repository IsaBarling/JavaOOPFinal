package controller;

import data.user.User;

public interface Controller<E extends User, I> {

    E create(E entity);

    E findById(I id);



    }

