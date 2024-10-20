package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.surveys.internal.model.QuestionMetrics;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zG2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12057zG2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new QuestionMetrics(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new QuestionMetrics[i];
    }
}
