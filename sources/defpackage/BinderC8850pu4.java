package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pu4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC8850pu4 extends AbstractBinderC6443iu4 {
    public final /* synthetic */ C9529rt4 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC8850pu4(C9529rt4 c9529rt4) {
        super("com.google.android.youtube.player.internal.IConnectionCallbacks");
        this.g = c9529rt4;
    }

    @Override // defpackage.AbstractBinderC6443iu4
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        String readString = parcel.readString();
        IBinder readStrongBinder = parcel.readStrongBinder();
        C9529rt4 c9529rt4 = this.g;
        HandlerC4039bu4 handlerC4039bu4 = c9529rt4.c;
        handlerC4039bu4.sendMessage(handlerC4039bu4.obtainMessage(1, new C4725du4(c9529rt4, readString, readStrongBinder)));
        parcel2.writeNoException();
        return true;
    }
}
