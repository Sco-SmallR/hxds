package com.example.hxds.bff.customer.service;

import com.example.hxds.bff.customer.controller.form.*;
import com.example.hxds.common.util.R;

import java.util.HashMap;

public interface OrderService {
    public HashMap createNewOrder(CreateNewOrderForm form);

    public Integer searchOrderStatus(SearchOrderStatusForm form);

    public String deleteUnAcceptOrder(DeleteUnAcceptOrderForm form);

    public HashMap hasCustomerCurrentOrder(HasCustomerCurrentOrderForm form);

    public HashMap searchOrderForMoveById(SearchOrderForMoveByIdForm form);

    public boolean confirmArriveStartPlace(ConfirmArriveStartPlaceForm form);

    public HashMap searchOrderById(SearchOrderByIdForm form);


}

