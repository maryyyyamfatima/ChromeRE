package defpackage;

import android.content.Context;
import android.media.session.MediaSession;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vR1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10739vR1 extends C10396uR1 {
    public C10739vR1(Context context, String str) {
        super(context, str);
    }

    @Override // defpackage.AbstractC9367rR1
    public final MediaSession a(Context context, String str) {
        return new MediaSession(context, str, null);
    }
}
