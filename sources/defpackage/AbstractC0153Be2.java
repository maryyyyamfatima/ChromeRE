package defpackage;

import j$.util.Optional;
import j$.util.function.Supplier;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Be2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0153Be2 {
    public static Optional a(boolean z, Supplier supplier) {
        return z ? Optional.ofNullable(supplier.get()) : Optional.empty();
    }
}
