package defpackage;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorDescription;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.components.signin.AccountManagerFacade;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Y2 implements AccountManagerFacade {
    public final P2 a;
    public final C12157za2 b = new C12157za2();
    public final AtomicReference c = new AtomicReference();
    public final AtomicReference d = new AtomicReference();
    public MC2 e = new MC2();

    /* JADX WARN: Type inference failed for: r0v7, types: [S2] */
    public Y2(P2 p2) {
        Object obj = ThreadUtils.a;
        this.a = p2;
        C5756gu3 c5756gu3 = (C5756gu3) p2;
        c5756gu3.b = new F4() { // from class: R2
            @Override // defpackage.F4
            public final void E() {
                Y2 y2 = Y2.this;
                y2.getClass();
                Object obj2 = ThreadUtils.a;
                new X2(y2).c(AbstractC0185Bl.f);
            }
        };
        Context context = V60.a;
        C5412fu3 c5412fu3 = new C5412fu3(c5756gu3);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.accounts.LOGIN_ACCOUNTS_CHANGED");
        context.registerReceiver(c5412fu3, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter2.addDataScheme("package");
        intentFilter2.addDataPath("com.google.android.gms", 1);
        context.registerReceiver(c5412fu3, intentFilter2);
        new L3(new Callback() { // from class: S2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                Y2 y2 = Y2.this;
                y2.d.set((List) obj2);
                y2.l();
            }
        });
        this.e.g(new Callback() { // from class: T2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                EI2.h(((List) obj2).size(), 50, "Signin.AndroidNumberOfDeviceAccounts");
            }
        });
        new X2(this).c(AbstractC0185Bl.f);
    }

    @Override // org.chromium.components.signin.AccountManagerFacade
    public final void b(F4 f4) {
        Object obj = ThreadUtils.a;
        this.b.a(f4);
    }

    @Override // org.chromium.components.signin.AccountManagerFacade
    public final void j(F4 f4) {
        Object obj = ThreadUtils.a;
        this.b.d(f4);
    }

    @Override // org.chromium.components.signin.AccountManagerFacade
    public final MC2 a() {
        Object obj = ThreadUtils.a;
        return this.e;
    }

    @Override // org.chromium.components.signin.AccountManagerFacade
    public final boolean k() {
        for (AuthenticatorDescription authenticatorDescription : ((C5756gu3) this.a).a.getAuthenticatorTypes()) {
            if ("com.google".equals(authenticatorDescription.type)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.chromium.components.signin.AccountManagerFacade
    public final G0 i(Account account, String str) {
        return this.a.c(account, str);
    }

    @Override // org.chromium.components.signin.AccountManagerFacade
    public final void h(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        P30 p30 = new P30(new O30() { // from class: U2
            @Override // defpackage.O30
            public final /* synthetic */ void a(Object obj) {
            }

            @Override // defpackage.O30
            public final /* synthetic */ void b(boolean z) {
            }

            @Override // defpackage.O30
            public final Object run() {
                String str2 = str;
                ((C5756gu3) Y2.this.a).getClass();
                try {
                    AbstractC7174l21.l(V60.a, str2);
                    return Boolean.TRUE;
                } catch (C6486j21 e) {
                    throw new C10854vm(false, (Exception) e);
                } catch (IOException e2) {
                    throw new C10854vm(true, (Exception) e2);
                }
            }
        });
        Object obj = ThreadUtils.a;
        p30.h.set(false);
        new N30(p30).c(AbstractC0185Bl.e);
    }

    @Override // org.chromium.components.signin.AccountManagerFacade
    public final void d(Account account, Q2 q2) {
        Object obj = ThreadUtils.a;
        new V2(this, account, q2).c(AbstractC0185Bl.e);
    }

    @Override // org.chromium.components.signin.AccountManagerFacade
    public final void f(final Callback callback) {
        FI2.a("Signin_AddAccountToDevice");
        C5756gu3 c5756gu3 = (C5756gu3) this.a;
        c5756gu3.getClass();
        c5756gu3.a.addAccount("com.google", null, null, null, null, new AccountManagerCallback() { // from class: du3
            @Override // android.accounts.AccountManagerCallback
            public final void run(AccountManagerFuture accountManagerFuture) {
                Callback callback2 = Callback.this;
                try {
                    callback2.onResult((Intent) ((Bundle) accountManagerFuture.getResult()).getParcelable("intent"));
                } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                    AbstractC4851eH1.a("Auth", "Error while creating an intent to add an account: ", e);
                    callback2.onResult(null);
                }
            }
        }, null);
    }

    @Override // org.chromium.components.signin.AccountManagerFacade
    public final void g(Account account, Activity activity, final Callback callback) {
        C5756gu3 c5756gu3 = (C5756gu3) this.a;
        c5756gu3.getClass();
        Object obj = ThreadUtils.a;
        AccountManagerCallback<Bundle> accountManagerCallback = new AccountManagerCallback() { // from class: eu3
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException
                */
            @Override // android.accounts.AccountManagerCallback
            public final void run(android.accounts.AccountManagerFuture r5) {
                /*
                    r4 = this;
                    java.lang.String r0 = "Auth"
                    r1 = 1
                    r2 = 0
                    java.lang.Object r5 = r5.getResult()     // Catch: android.accounts.OperationCanceledException -> Lb java.io.IOException -> L13 android.accounts.AuthenticatorException -> L15
                    android.os.Bundle r5 = (android.os.Bundle) r5     // Catch: android.accounts.OperationCanceledException -> Lb java.io.IOException -> L13 android.accounts.AuthenticatorException -> L15
                    goto L20
                Lb:
                    java.lang.String r5 = "Updating credentials was cancelled."
                    java.lang.Object[] r3 = new java.lang.Object[r2]
                    defpackage.AbstractC4851eH1.f(r0, r5, r3)
                    goto L1f
                L13:
                    r5 = move-exception
                    goto L16
                L15:
                    r5 = move-exception
                L16:
                    java.lang.Object[] r3 = new java.lang.Object[r1]
                    r3[r2] = r5
                    java.lang.String r5 = "Error while update credentials: "
                    defpackage.AbstractC4851eH1.a(r0, r5, r3)
                L1f:
                    r5 = 0
                L20:
                    if (r5 == 0) goto L2b
                    java.lang.String r0 = "accountType"
                    java.lang.String r5 = r5.getString(r0)
                    if (r5 == 0) goto L2b
                    goto L2c
                L2b:
                    r1 = r2
                L2c:
                    org.chromium.base.Callback r5 = org.chromium.base.Callback.this
                    if (r5 == 0) goto L37
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                    r5.onResult(r0)
                L37:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.C5068eu3.run(android.accounts.AccountManagerFuture):void");
            }
        };
        c5756gu3.a.updateCredentials(account, "android", new Bundle(), activity, accountManagerCallback, null);
    }

    @Override // org.chromium.components.signin.AccountManagerFacade
    public final String c(String str) {
        ((C5756gu3) this.a).getClass();
        try {
            return AbstractC7174l21.n(V60.a, str);
        } catch (C6486j21 | IOException e) {
            AbstractC4851eH1.a("Auth", "SystemAccountManagerDelegate.getAccountGaiaId", e);
            return null;
        }
    }

    @Override // org.chromium.components.signin.AccountManagerFacade
    public final MC2 e(Account account) {
        MC2 mc2 = new MC2();
        Object obj = ThreadUtils.a;
        new W2(this, account, mc2).c(AbstractC0185Bl.e);
        return mc2;
    }

    public final void l() {
        List unmodifiableList;
        AtomicReference atomicReference = this.c;
        if (atomicReference.get() == null) {
            return;
        }
        AtomicReference atomicReference2 = this.d;
        if (atomicReference2.get() == null) {
            return;
        }
        if (((List) atomicReference2.get()).isEmpty()) {
            unmodifiableList = (List) atomicReference.get();
        } else {
            ArrayList arrayList = new ArrayList();
            for (Account account : (List) atomicReference.get()) {
                Iterator it = ((List) atomicReference2.get()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        C3317Zn2 c3317Zn2 = (C3317Zn2) it.next();
                        String str = account.name;
                        ArrayList arrayList2 = c3317Zn2.a;
                        boolean z = false;
                        if (arrayList2.size() == 1) {
                            z = str.equals(arrayList2.get(0));
                        } else {
                            String str2 = (String) arrayList2.get(0);
                            if (str.startsWith(str2)) {
                                String str3 = (String) arrayList2.get(arrayList2.size() - 1);
                                if (str.endsWith(str3)) {
                                    int length = str2.length();
                                    Iterator it2 = arrayList2.subList(1, arrayList2.size() - 1).iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            String str4 = (String) it2.next();
                                            int indexOf = str.indexOf(str4, length);
                                            if (indexOf == -1) {
                                                break;
                                            } else {
                                                length = indexOf + str4.length();
                                            }
                                        } else if (str3.length() + length <= str.length()) {
                                            z = true;
                                        }
                                    }
                                }
                            }
                        }
                        if (z) {
                            arrayList.add(account);
                            break;
                        }
                    }
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        if (this.e.d()) {
            this.e = MC2.c(unmodifiableList);
        } else {
            this.e.b(unmodifiableList);
        }
        Iterator it3 = this.b.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it3;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((F4) c11814ya2.next()).E();
            }
        }
    }
}
