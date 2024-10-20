package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.vr.vrcore.controller.api.ControllerEventPacket;
import java.util.ArrayDeque;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class F80 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ControllerEventPacket[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ControllerEventPacket controllerEventPacket;
        synchronized (ControllerEventPacket.q) {
            ArrayDeque arrayDeque = ControllerEventPacket.p;
            controllerEventPacket = arrayDeque.isEmpty() ? new ControllerEventPacket() : (ControllerEventPacket) arrayDeque.remove();
        }
        controllerEventPacket.d(parcel);
        return controllerEventPacket;
    }
}
