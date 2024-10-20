package org.chromium.chrome.browser.vr;

import android.os.Handler;
import defpackage.AbstractC11864yi4;
import defpackage.AbstractC12207zi4;
import defpackage.Bi4;
import defpackage.Ci4;
import defpackage.Di4;
import defpackage.UR;
import org.chromium.chrome.browser.vr.keyboard.TextEditAction;
import org.chromium.content.browser.input.ImeAdapterImpl;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class VrInputConnection {
    public final long a;
    public final ImeAdapterImpl b;
    public Handler c;

    public static VrInputConnection create(long j, WebContents webContents) {
        return new VrInputConnection(j, webContents);
    }

    public VrInputConnection(long j, WebContents webContents) {
        this.a = j;
        this.b = ImeAdapterImpl.b(webContents);
    }

    public void requestTextState() {
        UR ur = this.b.h;
        if (ur == null) {
            return;
        }
        if (this.c == null) {
            this.c = new Handler();
        }
        AbstractC11864yi4.a(ur).post(new Bi4(this, ur));
    }

    public void onKeyboardEdit(TextEditAction[] textEditActionArr) {
        if (textEditActionArr.length == 0) {
            return;
        }
        UR ur = this.b.h;
        AbstractC12207zi4.a(ur).post(new Ci4(ur, textEditActionArr));
    }

    public void submitInput() {
        UR ur = this.b.h;
        AbstractC12207zi4.a(ur).post(new Di4(ur));
    }
}
