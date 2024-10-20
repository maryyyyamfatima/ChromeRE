package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.surveys.SurveyMetadata;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lr3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1518Lr3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new SurveyMetadata(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SurveyMetadata[i];
    }
}
