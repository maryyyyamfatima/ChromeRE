package defpackage;

import android.os.Parcel;
import android.util.Log;
import com.google.vr.internal.controller.ControllerServiceBridge;
import com.google.vr.sdk.common.deps.b;
import com.google.vr.sdk.common.deps.c;
import com.google.vr.vrcore.controller.api.ControllerEventPacket;
import com.google.vr.vrcore.controller.api.ControllerEventPacket2;
import com.google.vr.vrcore.controller.api.ControllerListenerOptions;
import com.google.vr.vrcore.controller.api.ControllerOrientationEvent;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eb1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractBinderC4952eb1 extends b {
    public AbstractBinderC4952eb1() {
        attachInterface(this, "com.google.vr.vrcore.controller.api.IControllerListener");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeInt(22);
        } else if (i != 2) {
            switch (i) {
                case 9:
                    S80 s80 = (S80) ((Q80) this).a.get();
                    ControllerListenerOptions controllerListenerOptions = s80 == null ? null : s80.b;
                    parcel2.writeNoException();
                    c.b(parcel2, controllerListenerOptions);
                    break;
                case 10:
                    ControllerEventPacket controllerEventPacket = (ControllerEventPacket) c.a(parcel, ControllerEventPacket.CREATOR);
                    S80 s802 = (S80) ((Q80) this).a.get();
                    if (s802 != null) {
                        controllerEventPacket.m(s802.c);
                        s802.a.onControllerEventPacket(controllerEventPacket);
                        controllerEventPacket.g();
                        break;
                    }
                    break;
                case 11:
                    ControllerOrientationEvent controllerOrientationEvent = (ControllerOrientationEvent) c.a(parcel, ControllerOrientationEvent.CREATOR);
                    S80 s803 = (S80) ((Q80) this).a.get();
                    if (s803 != null) {
                        controllerOrientationEvent.g = s803.c;
                        s803.a.onControllerRecentered(controllerOrientationEvent);
                        break;
                    }
                    break;
                case 12:
                    ControllerEventPacket2 controllerEventPacket2 = (ControllerEventPacket2) c.a(parcel, ControllerEventPacket2.CREATOR);
                    S80 s804 = (S80) ((Q80) this).a.get();
                    if (s804 != null) {
                        AtomicInteger atomicInteger = ControllerServiceBridge.o;
                        if (controllerEventPacket2.v != 0) {
                            long convert = TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS) - controllerEventPacket2.v;
                            if (convert > 300) {
                                StringBuilder sb = new StringBuilder(122);
                                sb.append("Experiencing large controller packet delivery time between service and  client: timestamp diff in ms: ");
                                sb.append(convert);
                                Log.w("VrCtl.ServiceBridge", sb.toString());
                            }
                        }
                        controllerEventPacket2.m(s804.c);
                        s804.a.onControllerEventPacket2(controllerEventPacket2);
                        controllerEventPacket2.g();
                        break;
                    }
                    break;
                default:
                    return false;
            }
        } else {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            S80 s805 = (S80) ((Q80) this).a.get();
            if (s805 != null) {
                s805.a.onControllerStateChanged(readInt, readInt2);
            }
        }
        return true;
    }
}
