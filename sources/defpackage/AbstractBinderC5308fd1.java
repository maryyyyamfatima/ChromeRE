package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.languageprofile.LanguageFluency;
import com.google.android.gms.languageprofile.LanguagePreference;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fd1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5308fd1 extends AbstractBinderC7826mw {
    public AbstractBinderC5308fd1() {
        super("com.google.android.gms.languageprofile.internal.ILanguageProfileCallbacks");
    }

    @Override // defpackage.AbstractBinderC7826mw
    public final boolean f1(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel.readString();
            AbstractBinderC7826mw.g1(parcel);
            throw new UnsupportedOperationException();
        }
        if (i == 2) {
            Status status = (Status) AbstractC11786yV.a(parcel, Status.CREATOR);
            ArrayList createTypedArrayList = parcel.createTypedArrayList(LanguagePreference.CREATOR);
            AbstractBinderC7826mw.g1(parcel);
            RF3.a(status, createTypedArrayList, ((BinderC2971Ww1) this).a);
            return true;
        }
        if (i == 3) {
            parcel.createTypedArrayList(LanguageFluency.CREATOR);
            AbstractBinderC7826mw.g1(parcel);
            throw new UnsupportedOperationException();
        }
        if (i != 4) {
            return false;
        }
        parcel.readArrayList(AbstractC11786yV.a);
        AbstractBinderC7826mw.g1(parcel);
        throw new UnsupportedOperationException();
    }
}
