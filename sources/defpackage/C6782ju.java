package defpackage;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wallet.callback.CallbackOutput;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ju, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6782ju implements InterfaceC1572Mc2 {
    public Messenger a;
    public final int b;

    public C6782ju(Messenger messenger, int i) {
        this.a = messenger;
        this.b = i;
    }

    @Override // defpackage.InterfaceC1572Mc2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized void a(CallbackOutput callbackOutput) {
        if (this.a != null) {
            try {
                int i = callbackOutput.g;
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.arg1 = this.b;
                Bundle bundle = new Bundle();
                bundle.putByteArray("extra_callback_output", ST2.b(callbackOutput));
                obtain.setData(bundle);
                Messenger messenger = this.a;
                if (messenger != null) {
                    messenger.send(obtain);
                }
                this.a = null;
            } catch (RemoteException e) {
                Log.e("BaseCallbackTaskService", "Error sending result of task to the callback service client for BaseCallbackTaskService", e);
            }
        }
    }
}
