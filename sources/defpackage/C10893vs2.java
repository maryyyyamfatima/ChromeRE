package defpackage;

import J.N;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.FaultObserver;
import com.google.android.libraries.elements.interfaces.FaultSubscription;
import com.google.android.libraries.elements.interfaces.Observer;
import com.google.android.libraries.elements.interfaces.Snapshot;
import com.google.android.libraries.elements.interfaces.Subscription;
import com.google.android.libraries.elements.interfaces.TransactionRecord;
import com.google.android.libraries.search.rendering.xuikit.runtime.persistentstore.PersistentByteStoreInstaller$PersistenceSubscription$faultObserver$1;
import com.google.android.libraries.search.rendering.xuikit.runtime.persistentstore.PersistentByteStoreInstaller$PersistenceSubscription$observer$1;
import com.google.common.util.concurrent.SettableFuture;
import defpackage.AV0;
import defpackage.AbstractC0087Ar1;
import defpackage.AbstractC0719Fn3;
import defpackage.C10893vs2;
import defpackage.C11236ws2;
import defpackage.C3040Xk0;
import defpackage.C7221lA0;
import defpackage.C9596s52;
import defpackage.C9864ss2;
import defpackage.I90;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vs2 */
/* loaded from: classes.dex */
public final class C10893vs2 implements Closeable {
    public final ByteStore a;
    public final C0743Fs2 g;
    public final String h;
    public Subscription i;
    public FaultSubscription j;
    public InterfaceC2910Wk0 k;
    public final HashSet l;
    public final Object m;
    public final PersistentByteStoreInstaller$PersistenceSubscription$observer$1 n;
    public final PersistentByteStoreInstaller$PersistenceSubscription$faultObserver$1 o;
    public final /* synthetic */ C11236ws2 p;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(defpackage.C10893vs2 r8, java.lang.String r9, defpackage.InterfaceC8927q80 r10) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10893vs2.c(vs2, java.lang.String, q80):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.libraries.search.rendering.xuikit.runtime.persistentstore.PersistentByteStoreInstaller$PersistenceSubscription$observer$1] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.android.libraries.search.rendering.xuikit.runtime.persistentstore.PersistentByteStoreInstaller$PersistenceSubscription$faultObserver$1] */
    public C10893vs2(final C11236ws2 c11236ws2, ByteStore byteStore, C0743Fs2 c0743Fs2, String str) {
        AbstractC0087Ar1.e(c0743Fs2, "diskCache");
        AbstractC0087Ar1.e(str, "prefix");
        this.p = c11236ws2;
        this.a = byteStore;
        this.g = c0743Fs2;
        this.h = str;
        this.l = new HashSet();
        this.m = new Object();
        this.n = new Observer() { // from class: com.google.android.libraries.search.rendering.xuikit.runtime.persistentstore.PersistentByteStoreInstaller$PersistenceSubscription$observer$1
            @Override // com.google.android.libraries.elements.interfaces.Observer
            public void storeDidUpdate(ByteStore byteStore2, TransactionRecord transactionRecord) {
                C10893vs2 c10893vs2 = C10893vs2.this;
                synchronized (c10893vs2.m) {
                    if (transactionRecord != null) {
                        ArrayList<String> keysOrdered = transactionRecord.keysOrdered();
                        if (keysOrdered != null) {
                            for (String str2 : keysOrdered) {
                                AbstractC0087Ar1.d(str2, "key");
                                if (AbstractC0719Fn3.d(str2, c10893vs2.h)) {
                                    c10893vs2.l.add(str2);
                                    Snapshot endState = transactionRecord.endState();
                                    byte[] find = endState != null ? endState.find(str2) : null;
                                    if (find == null) {
                                        C10893vs2.b(c10893vs2, str2);
                                    } else {
                                        C10893vs2.e(c10893vs2, str2, find);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        };
        this.o = new FaultObserver() { // from class: com.google.android.libraries.search.rendering.xuikit.runtime.persistentstore.PersistentByteStoreInstaller$PersistenceSubscription$faultObserver$1
            @Override // com.google.android.libraries.elements.interfaces.FaultObserver
            public void storeDidFault(ByteStore byteStore2, String str2) {
                AbstractC0087Ar1.e(str2, "key");
                if (AbstractC0719Fn3.d(str2, C10893vs2.this.h)) {
                    C11236ws2 c11236ws22 = c11236ws2;
                    C9596s52 c9596s52 = c11236ws22.c;
                    C10893vs2 c10893vs2 = C10893vs2.this;
                    AbstractC0087Ar1.e(c9596s52, "<this>");
                    AV0 c9864ss2 = new C9864ss2(c10893vs2, str2, null);
                    C3040Xk0 c3040Xk0 = new C3040Xk0(I90.a(c11236ws22.b, C7221lA0.a), true);
                    c3040Xk0.M(1, c3040Xk0, c9864ss2);
                    c10893vs2.k = c3040Xk0;
                }
            }
        };
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC2910Wk0 interfaceC2910Wk0 = this.k;
        if (interfaceC2910Wk0 != null) {
            interfaceC2910Wk0.u(null);
        }
        Subscription subscription = this.i;
        if (subscription != null) {
            subscription.cancel();
        }
        FaultSubscription faultSubscription = this.j;
        if (faultSubscription != null) {
            faultSubscription.cancel();
        }
    }

    public static final void b(C10893vs2 c10893vs2, String str) {
        C1003Hs2 a = AbstractC11922ys2.a(str);
        final C0743Fs2 c0743Fs2 = c10893vs2.g;
        c0743Fs2.getClass();
        final byte[] byteArray = a.toByteArray();
        final SettableFuture settableFuture = new SettableFuture();
        ((NJ0) c0743Fs2.b).a(new Runnable() { // from class: zs2
            @Override // java.lang.Runnable
            public final void run() {
                KJ0 kj0 = C0743Fs2.this.a;
                final SettableFuture settableFuture2 = settableFuture;
                Runnable runnable = new Runnable() { // from class: Ds2
                    @Override // java.lang.Runnable
                    public final void run() {
                        SettableFuture.this.t(null);
                    }
                };
                kj0.getClass();
                N.Mhn7cHli(byteArray, runnable);
            }
        }, 0L);
        WD1.a(settableFuture).s(new C9521rs2(c10893vs2.p));
    }

    public static final void e(C10893vs2 c10893vs2, String str, byte[] bArr) {
        C1003Hs2 a = AbstractC11922ys2.a(str);
        C1133Is2 c1133Is2 = (C1133Is2) C1263Js2.l.j();
        AbstractC0087Ar1.d(c1133Is2, "newBuilder()");
        ZD f = AbstractC4147cE.f(bArr, 0, bArr.length);
        if (c1133Is2.h) {
            c1133Is2.l();
            c1133Is2.h = false;
        }
        C1263Js2 c1263Js2 = (C1263Js2) c1133Is2.g;
        c1263Js2.getClass();
        c1263Js2.j |= 1;
        c1263Js2.k = f;
        QX0 j = c1133Is2.j();
        AbstractC0087Ar1.d(j, "_builder.build()");
        final C0743Fs2 c0743Fs2 = c10893vs2.g;
        c0743Fs2.getClass();
        final byte[] byteArray = a.toByteArray();
        final byte[] byteArray2 = ((C1263Js2) j).toByteArray();
        final SettableFuture settableFuture = new SettableFuture();
        ((NJ0) c0743Fs2.b).a(new Runnable() { // from class: Bs2
            @Override // java.lang.Runnable
            public final void run() {
                KJ0 kj0 = C0743Fs2.this.a;
                final SettableFuture settableFuture2 = settableFuture;
                Runnable runnable = new Runnable() { // from class: Es2
                    @Override // java.lang.Runnable
                    public final void run() {
                        SettableFuture.this.t(null);
                    }
                };
                kj0.getClass();
                N.MrDK_Mhx(byteArray, byteArray2, runnable);
            }
        }, 0L);
        WD1.a(settableFuture).s(new C10550us2(c10893vs2.p));
    }
}
