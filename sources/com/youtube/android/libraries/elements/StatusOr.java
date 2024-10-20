package com.youtube.android.libraries.elements;

import defpackage.C2008Pl3;
import defpackage.KV0;
import io.grpc.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class StatusOr {
    private final boolean hasValue;
    private final Status status;
    private final Object value;

    public StatusOr(Status status, Object obj, boolean z) {
        this.status = status;
        this.value = obj;
        this.hasValue = z;
    }

    public static StatusOr fromValue(Object obj) {
        return new StatusOr(Status.OK, obj, true);
    }

    public static StatusOr fromStatus(Status status) {
        if (status.b()) {
            throw new IllegalArgumentException("StatusOr with status OK must have a value. Please use fromValue(T value) instead.");
        }
        return new StatusOr(status, null, false);
    }

    public final boolean a() {
        return this.hasValue;
    }

    public final Object c() {
        return this.value;
    }

    public final Object d(KV0 kv0) {
        Object obj = this.value;
        if (obj != null) {
            return obj;
        }
        Status status = this.status;
        status.getClass();
        throw kv0.a(new C2008Pl3(status));
    }

    public final Status b() {
        return this.status;
    }
}
