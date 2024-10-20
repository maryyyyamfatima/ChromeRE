package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5362fm1 extends InputConnectionWrapper {
    public final /* synthetic */ C5018em1 a;

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        if (this.a.a((inputContentInfo != null && Build.VERSION.SDK_INT >= 25) ? new C8799pm1(new C7768mm1(inputContentInfo)) : null, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5362fm1(InputConnection inputConnection, C5018em1 c5018em1) {
        super(inputConnection, false);
        this.a = c5018em1;
    }
}
