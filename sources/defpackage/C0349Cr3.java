package defpackage;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.surveys.internal.model.SurveyDataImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cr3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0349Cr3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        try {
            return new SurveyDataImpl(parcel);
        } catch (C1127Ir1 e) {
            throw new BadParcelableException(e);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SurveyDataImpl[i];
    }
}
