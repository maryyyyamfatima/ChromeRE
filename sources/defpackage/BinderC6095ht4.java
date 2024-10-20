package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.c;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ht4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC6095ht4 extends AbstractBinderC6443iu4 implements Ew4 {
    public final /* synthetic */ C6781jt4 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC6095ht4(C6781jt4 c6781jt4) {
        super("com.google.android.youtube.player.internal.IJarEmbedFragmentClient");
        this.g = c6781jt4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractBinderC6443iu4
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        int i2 = 4;
        r5 = null;
        Zt4 zt4 = null;
        C6781jt4 c6781jt4 = this.g;
        switch (i) {
            case 2:
                Parcelable.Creator creator = Bundle.CREATOR;
                int i3 = AbstractC5419fv4.a;
                Parcelable parcelable = parcel.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcel) : null;
                Bundle bundle = new Bundle();
                bundle.putString("dev_key", c6781jt4.j);
                bundle.putBundle("forwarding_state", (Bundle) parcelable);
                C7831mw4 c7831mw4 = new C7831mw4();
                c7831mw4.r0.c(bundle);
                c7831mw4.Q0(c6781jt4.e().h0(), "com.google.android.youtube.dialog_fragment_tag");
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                if (!C7831mw4.class.isInstance(c6781jt4.a)) {
                    Pu4.a("Cannot dismiss a non-fullscreen playback.", new Object[0]);
                }
                c B = c6781jt4.e().h0().B("com.google.android.youtube.dialog_fragment_tag");
                if (!C7831mw4.class.isInstance(B)) {
                    Pu4.a("Cannot find fullscreen playback.", new Object[0]);
                    break;
                } else {
                    ((C7831mw4) B).dismissAllowingStateLoss();
                    break;
                }
            case 4:
                int readInt = parcel.readInt();
                parcel.readString();
                long readLong = parcel.readLong();
                if (readInt == 1) {
                    i2 = 1;
                } else if (readInt == 2) {
                    i2 = 2;
                } else if (readInt == 3) {
                    i2 = 3;
                } else if (readInt != 4) {
                    i2 = 5;
                    if (readInt != 5) {
                        i2 = 0;
                    }
                }
                C10907vu4 c10907vu4 = i2 != 0 ? new C10907vu4(i2, readLong) : null;
                if (c10907vu4 != null) {
                    c6781jt4.d.b(c10907vu4);
                    break;
                }
                break;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                parcel.readLong();
                break;
            case 6:
                C10221tu4 a = C10221tu4.a(parcel.readInt());
                if (a != null) {
                    c6781jt4.e.a(a);
                    break;
                }
                break;
            case 7:
                int i4 = AbstractC5419fv4.a;
                c6781jt4.f.a(parcel.readInt() != 0);
                break;
            case 8:
                parcel.readString();
                String a2 = c6781jt4.o.a();
                parcel2.writeNoException();
                parcel2.writeString(a2);
                return true;
            case 9:
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                byte b = readInt2 != 0 ? readInt2 != 1 ? readInt2 != 2 ? readInt2 != 3 ? false : 4 : 3 : 2 : true;
                if (readInt3 == 0) {
                    i2 = 1;
                } else if (readInt3 == 1) {
                    i2 = 2;
                } else if (readInt3 == 2) {
                    i2 = 3;
                } else if (readInt3 != 3) {
                    i2 = 0;
                }
                if (b != false && i2 != 0) {
                    zt4 = new Zt4();
                }
                if (zt4 != null) {
                    c6781jt4.c.b(zt4);
                    break;
                }
                break;
            case 10:
                int i5 = AbstractC5419fv4.a;
                c6781jt4.c.a(parcel.readInt() != 0);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
