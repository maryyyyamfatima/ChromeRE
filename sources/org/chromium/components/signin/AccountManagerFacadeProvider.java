package org.chromium.components.signin;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AccountManagerFacadeProvider {
    public static final AtomicReference a = new AtomicReference();
    public static AccountManagerFacade b;

    public static AccountManagerFacade getInstance() {
        AccountManagerFacade accountManagerFacade = (AccountManagerFacade) a.get();
        if (accountManagerFacade != null) {
            return accountManagerFacade;
        }
        throw new IllegalStateException("AccountManagerFacade is not yet initialized!");
    }
}
