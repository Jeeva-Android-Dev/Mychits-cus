package com.mazenet.mounica.mazechit_customer.utilities;



public interface MvpView {

    void showProgressDialog();

    void hideProgressDialog();

    void showDialogWithError(int errorCode, String error);

    void showNetWorkError();

}
