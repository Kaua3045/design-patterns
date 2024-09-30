package com.kaua.design.patterns.adapter;

class UserToCustomerAdapterImpl implements UserToCustomerAdapter{
    @Override
    public Customer convert(User user) {
        return new Customer(
                user.getName(),
                user.getLastName(),
                user.getEmail(),
                user.getCpfCnpj()
        );
    }
}
