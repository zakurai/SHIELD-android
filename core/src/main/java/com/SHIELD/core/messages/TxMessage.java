package com.SHIELD.core.messages;

import com.SHIELD.core.wallet.AbstractTransaction;

import java.io.Serializable;

/**
 * @author John L. Jegutanis
 */
public interface TxMessage extends Serializable {
    // TODO use an abstract transaction
    void serializeTo(AbstractTransaction transaction);

    enum Type {
        PUBLIC, PRIVATE
    }

    Type getType();
    String toString();
}
