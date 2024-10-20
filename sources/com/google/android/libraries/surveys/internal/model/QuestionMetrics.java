package com.google.android.libraries.surveys.internal.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import defpackage.AbstractC3208Yr3;
import defpackage.C12057zG2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class QuestionMetrics implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C12057zG2();
    public long a;
    public long g;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public QuestionMetrics() {
        this.a = -1L;
        this.g = -1L;
    }

    public QuestionMetrics(Parcel parcel) {
        this.a = parcel.readLong();
        this.g = parcel.readLong();
    }

    public final void d() {
        if (a()) {
            return;
        }
        this.a = SystemClock.elapsedRealtime();
    }

    public final void c() {
        if (!a()) {
            Log.e("SurveyQuestionMetrics", "Question was marked as answered but was never marked as shown.");
            return;
        }
        if (this.g >= 0) {
            int i = AbstractC3208Yr3.b;
        } else {
            this.g = SystemClock.elapsedRealtime();
        }
    }

    public final boolean a() {
        return this.a >= 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.g);
    }
}
