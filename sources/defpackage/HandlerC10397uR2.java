package defpackage;

import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uR2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC10397uR2 extends HandlerC10413uU3 {
    public final /* synthetic */ C11083wR2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC10397uR2(C11083wR2 c11083wR2, Looper looper) {
        super(looper);
        this.a = c11083wR2;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C11083wR2 c11083wR2 = this.a;
        c11083wR2.getClass();
        if (message == null) {
            return;
        }
        Object obj = message.obj;
        if (obj instanceof Intent) {
            Intent intent = (Intent) obj;
            intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
            if (intent.hasExtra("google.messenger")) {
                Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                if (parcelableExtra instanceof MessengerCompat) {
                    c11083wR2.e = (MessengerCompat) parcelableExtra;
                }
                if (parcelableExtra instanceof Messenger) {
                    c11083wR2.d = (Messenger) parcelableExtra;
                }
            }
            c11083wR2.c((Intent) message.obj);
            return;
        }
        Log.w("InstanceID", "Dropping invalid message");
    }
}
