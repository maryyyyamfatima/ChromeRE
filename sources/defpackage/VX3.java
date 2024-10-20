package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VX3 {
    public final YX3 a;
    public final C11205wn1 b;
    public final C10776vY3 c;

    public static void a(VX3 vx3, IX3 ix3, String str) {
        vx3.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("message", str);
        ix3.a("onNewLocationError", bundle);
        vx3.c.getClass();
        EI2.h(3, 4, "TrustedWebActivity.LocationUpdateErrorCode");
    }

    public VX3(C8719pY3 c8719pY3, C11205wn1 c11205wn1, C10776vY3 c10776vY3) {
        this.a = new YX3(c8719pY3);
        this.b = c11205wn1;
        this.c = c10776vY3;
    }

    public final boolean c(Uri uri) {
        HashSet b;
        C1193Je2 a = C1193Je2.a(uri);
        if (a == null || (b = this.b.b(a)) == null) {
            return false;
        }
        C8719pY3 c8719pY3 = this.a.a;
        return (c8719pY3.b.get(uri) == null && C8719pY3.a(c8719pY3.a, uri, b, false) == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [nY3] */
    public final void b(final Uri uri, final TX3 tx3) {
        final C7589mF a;
        final C1193Je2 a2 = C1193Je2.a(uri);
        if (a2 == null) {
            tx3.a();
            return;
        }
        HashSet b = this.b.b(a2);
        if (b == null || b.isEmpty()) {
            tx3.a();
            return;
        }
        YX3 yx3 = this.a;
        yx3.getClass();
        ExecutorC11534xl executorC11534xl = AbstractC0185Bl.e;
        final C8719pY3 c8719pY3 = yx3.a;
        HashMap hashMap = c8719pY3.b;
        final H30 h30 = (H30) hashMap.get(uri);
        if (h30 == null) {
            Context context = c8719pY3.a;
            Intent a3 = C8719pY3.a(context, uri, b, true);
            if (a3 == null) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No service exists for scope");
                BO2 bo2 = new BO2();
                bo2.h(illegalArgumentException);
                a = bo2;
            } else {
                final H30 h302 = new H30(new Runnable() { // from class: nY3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8719pY3.this.b.remove(uri);
                    }
                });
                hashMap.put(uri, h302);
                new AsyncTaskC8376oY3(context, a3, h302).executeOnExecutor(executorC11534xl, new Void[0]);
                a = AbstractC7933nF.a(new InterfaceC6901kF() { // from class: F30
                    @Override // defpackage.InterfaceC6901kF
                    public final Object a(C6215iF c6215iF) {
                        H30 h303 = H30.this;
                        int i = h303.h;
                        if (i == 0) {
                            h303.j.add(c6215iF);
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    throw new IllegalStateException("Service has been disconnected.");
                                }
                                if (i == 3) {
                                    throw h303.k;
                                }
                                throw new IllegalStateException("Connection state is invalid");
                            }
                            C7688mY3 c7688mY3 = h303.i;
                            if (c7688mY3 == null) {
                                throw new IllegalStateException("ConnectionHolder state is incorrect.");
                            }
                            c6215iF.a(c7688mY3);
                        }
                        return "ConnectionHolder, state = " + h303.h;
                    }
                });
            }
        } else {
            a = AbstractC7933nF.a(new InterfaceC6901kF() { // from class: F30
                @Override // defpackage.InterfaceC6901kF
                public final Object a(C6215iF c6215iF) {
                    H30 h303 = H30.this;
                    int i = h303.h;
                    if (i == 0) {
                        h303.j.add(c6215iF);
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                throw new IllegalStateException("Service has been disconnected.");
                            }
                            if (i == 3) {
                                throw h303.k;
                            }
                            throw new IllegalStateException("Connection state is invalid");
                        }
                        C7688mY3 c7688mY3 = h303.i;
                        if (c7688mY3 == null) {
                            throw new IllegalStateException("ConnectionHolder state is incorrect.");
                        }
                        c6215iF.a(c7688mY3);
                    }
                    return "ConnectionHolder, state = " + h303.h;
                }
            });
        }
        a.f(new Runnable() { // from class: XX3
            @Override // java.lang.Runnable
            public final void run() {
                TX3 tx32 = TX3.this;
                try {
                    tx32.b(a2, new ZX3((C7688mY3) a.get()));
                } catch (RemoteException e) {
                    e = e;
                    AbstractC4851eH1.f("TWAClient", "Failed to execute TWA command.", e);
                } catch (InterruptedException e2) {
                    e = e2;
                    AbstractC4851eH1.f("TWAClient", "Failed to execute TWA command.", e);
                } catch (SecurityException e3) {
                    e = e3;
                    AbstractC4851eH1.f("TWAClient", "Failed to connect to TWA to execute command", e);
                    tx32.a();
                } catch (ExecutionException e4) {
                    e = e4;
                    AbstractC4851eH1.f("TWAClient", "Failed to connect to TWA to execute command", e);
                    tx32.a();
                }
            }
        }, AbstractC3564aY3.a);
    }
}
