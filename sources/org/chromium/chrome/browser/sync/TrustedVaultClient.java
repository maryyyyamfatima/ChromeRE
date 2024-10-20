package org.chromium.chrome.browser.sync;

import J.N;
import defpackage.EX3;
import defpackage.InterfaceC11646y40;
import java.util.ArrayList;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.AppHooks;
import org.chromium.chrome.browser.sync.TrustedVaultClient;
import org.chromium.components.signin.base.CoreAccountInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class TrustedVaultClient {
    public static TrustedVaultClient c;
    public final EX3 a;
    public long b;

    public TrustedVaultClient(EX3 ex3) {
        this.a = ex3;
    }

    public static TrustedVaultClient a() {
        if (c == null) {
            c = new TrustedVaultClient(AppHooks.get().r());
        }
        return c;
    }

    public static void registerNative(long j) {
        a().b = j;
        a().getClass();
    }

    public static void unregisterNative(long j) {
        a().b = 0L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [AX3] */
    public static void fetchKeys(final int i, final CoreAccountInfo coreAccountInfo) {
        final ?? r0 = new InterfaceC11646y40() { // from class: AX3
            @Override // defpackage.InterfaceC11646y40
            public final void accept(Object obj) {
                List list = (List) obj;
                if (TrustedVaultClient.a().b == 0) {
                    return;
                }
                N.M0S8oNZH(TrustedVaultClient.a().b, i, coreAccountInfo.getGaiaId(), (byte[][]) list.toArray(new byte[0]));
            }
        };
        a().a.b(coreAccountInfo).h(new Callback() { // from class: BX3
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                r0.accept((List) obj);
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        }, new Callback() { // from class: CX3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                r0.accept(new ArrayList());
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [sX3] */
    public static void markLocalKeysAsStale(final int i, CoreAccountInfo coreAccountInfo) {
        final ?? r0 = new InterfaceC11646y40() { // from class: sX3
            @Override // defpackage.InterfaceC11646y40
            public final void accept(Object obj) {
                Boolean bool = (Boolean) obj;
                if (TrustedVaultClient.a().b == 0) {
                    return;
                }
                N.MtarWfOd(TrustedVaultClient.a().b, i, bool.booleanValue());
            }
        };
        a().a.c(coreAccountInfo).h(new Callback() { // from class: vX3
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                r0.accept((Boolean) obj);
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        }, new Callback() { // from class: wX3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                r0.accept(Boolean.TRUE);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [DX3] */
    public static void getIsRecoverabilityDegraded(final int i, CoreAccountInfo coreAccountInfo) {
        final ?? r0 = new InterfaceC11646y40() { // from class: DX3
            @Override // defpackage.InterfaceC11646y40
            public final void accept(Object obj) {
                Boolean bool = (Boolean) obj;
                if (TrustedVaultClient.a().b == 0) {
                    return;
                }
                N.Mi0CgY2y(TrustedVaultClient.a().b, i, bool.booleanValue());
            }
        };
        a().a.d(coreAccountInfo).h(new Callback() { // from class: tX3
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                r0.accept((Boolean) obj);
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        }, new Callback() { // from class: uX3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                r0.accept(Boolean.FALSE);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xX3] */
    public static void addTrustedRecoveryMethod(final int i, CoreAccountInfo coreAccountInfo, byte[] bArr, int i2) {
        final ?? r0 = new InterfaceC11646y40() { // from class: xX3
            @Override // defpackage.InterfaceC11646y40
            public final void accept(Object obj) {
                if (TrustedVaultClient.a().b == 0) {
                    return;
                }
                N.MKOQxzuE(TrustedVaultClient.a().b, i);
            }
        };
        a().a.f(coreAccountInfo, bArr, i2).h(new Callback() { // from class: yX3
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                r0.accept((Void) obj);
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        }, new Callback() { // from class: zX3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                r0.accept(null);
            }
        });
    }
}
