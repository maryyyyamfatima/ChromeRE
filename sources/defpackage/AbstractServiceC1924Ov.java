package defpackage;

import J.N;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.callback.CallbackInput;
import com.google.android.gms.wallet.callback.IntermediatePaymentData;
import com.google.android.gms.wallet.callback.PaymentAuthorizationResult;
import com.google.android.gms.wallet.callback.PaymentDataRequestUpdate;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.chromium.components.payments.GooglePayDataCallbacksService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ov, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC1924Ov extends Service {
    public Messenger a = new Messenger(new HandlerC6438iu(this, Looper.getMainLooper()));
    public ExecutorService g;

    public final void b() {
        super.onCreate();
        this.a = new Messenger(new HandlerC6438iu(this, Looper.getMainLooper()));
        this.g = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
    }

    public static void c(CallbackInput callbackInput, C6782ju c6782ju) {
        I31 i31;
        I31 i312;
        int i = callbackInput.a;
        if (i == 0) {
            throw new IllegalStateException("Callback Types must be set");
        }
        byte[] bArr = callbackInput.g;
        if (i == 1) {
            PaymentData paymentData = (PaymentData) (bArr != null ? (AbstractSafeParcelable) ST2.a(bArr, PaymentData.CREATOR) : null);
            final C1664Mv c1664Mv = new C1664Mv(c6782ju);
            if (!N.M1X7xdZV("GPayAppDynamicUpdate") || (i312 = GooglePayDataCallbacksService.h) == null || paymentData == null) {
                return;
            }
            final N31 n31 = (N31) i312;
            n31.H(paymentData.l, new InterfaceC1572Mc2() { // from class: J31
                @Override // defpackage.InterfaceC1572Mc2
                public final void a(Object obj) {
                    N31.this.getClass();
                    c1664Mv.a(new PaymentAuthorizationResult(N31.F((C0858Gp2) obj), null));
                }
            });
            return;
        }
        if (i == 2) {
            IntermediatePaymentData intermediatePaymentData = (IntermediatePaymentData) (bArr != null ? (AbstractSafeParcelable) ST2.a(bArr, IntermediatePaymentData.CREATOR) : null);
            final C1794Nv c1794Nv = new C1794Nv(c6782ju);
            if (!N.M1X7xdZV("GPayAppDynamicUpdate") || (i31 = GooglePayDataCallbacksService.h) == null || intermediatePaymentData == null) {
                return;
            }
            final N31 n312 = (N31) i31;
            n312.H(intermediatePaymentData.a, new InterfaceC1572Mc2() { // from class: K31
                @Override // defpackage.InterfaceC1572Mc2
                public final void a(Object obj) {
                    N31.this.getClass();
                    c1794Nv.a(new PaymentDataRequestUpdate(N31.F((C0858Gp2) obj), null));
                }
            });
            return;
        }
        throw new IllegalStateException("Unknown Callback Types");
    }

    public final IBinder a(Intent intent) {
        return this.a.getBinder();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return a(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        b();
    }
}
