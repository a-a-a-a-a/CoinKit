package com.hive.bitcoinkit;

public class SendingDustException extends Exception
{
    public SendingDustException(String message)
    {
        super(message);
    }
}
