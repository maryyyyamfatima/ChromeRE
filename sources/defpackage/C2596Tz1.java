package defpackage;

import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2596Tz1 {
    public final Bundle a;

    public C2596Tz1(Bundle bundle) {
        this.a = bundle;
    }

    public final C6368ii0[] a() {
        Parcelable[] parcelableArray = this.a.getParcelableArray("debug_response");
        if (parcelableArray == null) {
            return null;
        }
        C6368ii0[] c6368ii0Arr = new C6368ii0[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            c6368ii0Arr[i] = new C6368ii0((Bundle) parcelableArray[i]);
        }
        return c6368ii0Arr;
    }
}
