package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.surveys.internal.model.Answer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1440Lc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new Answer(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new Answer[i];
    }
}
