package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.vr.vrcore.controller.api.ControllerEventPacket2;
import java.util.ArrayDeque;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class G80 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ControllerEventPacket2[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ControllerEventPacket2 controllerEventPacket2;
        synchronized (ControllerEventPacket2.x) {
            ArrayDeque arrayDeque = ControllerEventPacket2.w;
            controllerEventPacket2 = arrayDeque.isEmpty() ? new ControllerEventPacket2() : (ControllerEventPacket2) arrayDeque.remove();
        }
        controllerEventPacket2.d(parcel);
        return controllerEventPacket2;
    }
}
