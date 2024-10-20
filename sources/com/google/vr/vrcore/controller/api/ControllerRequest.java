package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.vr.vrcore.base.api.ParcelableProto;
import defpackage.L80;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class ControllerRequest extends ParcelableProto {
    public static final Parcelable.Creator CREATOR = new L80();

    public ControllerRequest() {
    }

    public ControllerRequest(Parcel parcel) {
        super(parcel);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ControllerRequest) {
            return Arrays.equals(((ControllerRequest) obj).a, this.a);
        }
        return false;
    }
}
