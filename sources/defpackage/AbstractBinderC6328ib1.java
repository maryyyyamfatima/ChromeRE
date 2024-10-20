package defpackage;

import android.os.Parcel;
import com.google.vr.internal.controller.ControllerServiceBridge;
import com.google.vr.sdk.common.deps.b;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ib1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractBinderC6328ib1 extends b {
    public AbstractBinderC6328ib1() {
        attachInterface(this, "com.google.vr.vrcore.controller.api.IControllerServiceListener");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeInt(22);
        } else {
            if (i != 2) {
                return false;
            }
            int readInt = parcel.readInt();
            final ControllerServiceBridge controllerServiceBridge = (ControllerServiceBridge) ((R80) this).a.get();
            if (controllerServiceBridge != null) {
                if (readInt != 1) {
                    AtomicInteger atomicInteger = ControllerServiceBridge.o;
                } else {
                    controllerServiceBridge.g.post(new Runnable(controllerServiceBridge) { // from class: P80
                        public final ControllerServiceBridge a;

                        {
                            this.a = controllerServiceBridge;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
                        /* JADX WARN: Removed duplicated region for block: B:5:0x0046  */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void run() {
                            /*
                                r6 = this;
                                com.google.vr.internal.controller.ControllerServiceBridge r0 = r6.a
                                r0.getClass()
                                com.google.vr.internal.controller.ControllerServiceBridge.b()
                                hb1 r1 = r0.l
                                r2 = 0
                                if (r1 != 0) goto Le
                                goto L43
                            Le:
                                fb1 r1 = (defpackage.C5296fb1) r1     // Catch: android.os.RemoteException -> L22
                                android.os.Parcel r3 = r1.obtainAndWriteInterfaceToken()     // Catch: android.os.RemoteException -> L22
                                r4 = 10
                                android.os.Parcel r1 = r1.transactAndReadException(r4, r3)     // Catch: android.os.RemoteException -> L22
                                int r3 = r1.readInt()     // Catch: android.os.RemoteException -> L22
                                r1.recycle()     // Catch: android.os.RemoteException -> L22
                                goto L44
                            L22:
                                r1 = move-exception
                                java.lang.String r1 = java.lang.String.valueOf(r1)
                                int r3 = r1.length()
                                int r3 = r3 + 54
                                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                                r4.<init>(r3)
                                java.lang.String r3 = "Remote exception while getting number of controllers: "
                                r4.append(r3)
                                r4.append(r1)
                                java.lang.String r1 = r4.toString()
                                java.lang.String r3 = "VrCtl.ServiceBridge"
                                android.util.Log.w(r3, r1)
                            L43:
                                r3 = r2
                            L44:
                                if (r3 <= 0) goto L4e
                                boolean r1 = r0.n
                                if (r1 == 0) goto L74
                                r0.d()
                                goto L74
                            L4e:
                                android.util.SparseArray r1 = r0.k
                                int r3 = r1.size()
                                r4 = r2
                            L55:
                                if (r4 >= r3) goto L67
                                java.lang.Object r5 = r1.valueAt(r4)
                                S80 r5 = (defpackage.S80) r5
                                if (r5 == 0) goto L64
                                com.google.vr.internal.controller.ControllerServiceBridge$Callbacks r5 = r5.a
                                r5.onControllerStateChanged(r4, r2)
                            L64:
                                int r4 = r4 + 1
                                goto L55
                            L67:
                                com.google.vr.internal.controller.ControllerServiceBridge.b()
                                r1.clear()
                                S80 r0 = r0.m
                                com.google.vr.internal.controller.ControllerServiceBridge$Callbacks r0 = r0.a
                                r0.onServiceDisconnected()
                            L74:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.P80.run():void");
                        }
                    });
                }
            }
        }
        return true;
    }
}
