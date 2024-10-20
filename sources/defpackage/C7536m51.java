package defpackage;

import android.database.ContentObserver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: m51, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7536m51 extends ContentObserver {
    public C7536m51() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AbstractC0878Gt2.j.incrementAndGet();
    }
}
