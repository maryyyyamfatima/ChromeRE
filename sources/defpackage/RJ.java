package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RJ extends Binder implements InterfaceC0542Ee1 {
    public final /* synthetic */ VJ a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.InterfaceC0542Ee1
    public final void h0(final int i, final int i2, final long j, final Bundle bundle) {
        this.a.b.post(new Runnable() { // from class: PJ
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                */
            @Override // java.lang.Runnable
            public final void run() {
                /*
                    Method dump skipped, instructions count: 233
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.PJ.run():void");
            }
        });
    }

    @Override // android.os.Binder
    /* renamed from: a */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("org.chromium.base.process_launcher.IParentProcess");
        }
        if (i == 1598968902) {
            parcel2.writeString("org.chromium.base.process_launcher.IParentProcess");
            return true;
        }
        if (i == 1) {
            h0(parcel.readInt(), parcel.readInt(), parcel.readLong(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        } else if (i == 2) {
            T(parcel.readString());
            parcel2.writeNoException();
        } else if (i == 3) {
            e0();
            parcel2.writeNoException();
        } else {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        return true;
    }

    public RJ(VJ vj) {
        this.a = vj;
        attachInterface(this, "org.chromium.base.process_launcher.IParentProcess");
    }

    @Override // defpackage.InterfaceC0542Ee1
    public final void T(String str) {
        VJ vj;
        synchronized (this.a.a) {
            vj = this.a;
            vj.F = str;
        }
        vj.b.post(new QJ(this));
    }

    @Override // defpackage.InterfaceC0542Ee1
    public final void e0() {
        VJ vj;
        synchronized (this.a.a) {
            vj = this.a;
            vj.G = true;
        }
        vj.b.post(new QJ(this));
    }
}
