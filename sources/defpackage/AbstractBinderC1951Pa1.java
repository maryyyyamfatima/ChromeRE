package defpackage;

import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pa1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1951Pa1 extends AbstractBinderC7826mw implements InterfaceC2081Qa1 {
    public static final /* synthetic */ int a = 0;

    public AbstractBinderC1951Pa1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            InterfaceC9436re1 L = ((AbstractBinderC11635y21) this).L();
            parcel2.writeNoException();
            AbstractC11786yV.c(parcel2, L);
        } else {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(((AbstractBinderC11635y21) this).g);
        }
        return true;
    }
}
