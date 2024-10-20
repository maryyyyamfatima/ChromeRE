package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.chrome.R;
import java.io.File;
import java.io.IOException;
import org.chromium.base.ContentUriUtils;
import org.chromium.ui.base.SelectFileDialog;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: x23 */
/* loaded from: classes2.dex */
public final class C11294x23 extends AbstractC0185Bl {
    public final Boolean h;
    public final WindowAndroid i;
    public final InterfaceC4352cp4 j;
    public final /* synthetic */ SelectFileDialog k;

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        try {
            Context context = V60.a;
            SelectFileDialog selectFileDialog = this.k;
            String[] strArr = SelectFileDialog.q;
            selectFileDialog.getClass();
            return ContentUriUtils.b(File.createTempFile(String.valueOf(System.currentTimeMillis()), ".jpg", AbstractC8540p04.c(context)));
        } catch (IOException e) {
            AbstractC4851eH1.a("SelectFileDialog", "Cannot retrieve content uri from file", e);
            return null;
        }
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        Uri uri = (Uri) obj;
        SelectFileDialog selectFileDialog = this.k;
        selectFileDialog.j = uri;
        Intent intent = null;
        Boolean bool = this.h;
        if (uri == null) {
            if ((selectFileDialog.h && selectFileDialog.d("image")) || bool.booleanValue()) {
                selectFileDialog.m();
                return;
            } else {
                selectFileDialog.l(null);
                return;
            }
        }
        if (!bool.booleanValue()) {
            selectFileDialog.l(SelectFileDialog.f(selectFileDialog));
            return;
        }
        if (selectFileDialog.d("video")) {
            boolean hasPermission = selectFileDialog.k.hasPermission("android.permission.CAMERA");
            if (selectFileDialog.m && hasPermission) {
                intent = new Intent("android.media.action.VIDEO_CAPTURE");
            }
        } else {
            intent = SelectFileDialog.f(selectFileDialog);
        }
        this.i.B(intent, this.j, Integer.valueOf(R.string.0_resource_name_obfuscated_res_0x7f1405dd));
    }

    public C11294x23(SelectFileDialog selectFileDialog, Boolean bool, WindowAndroid windowAndroid, InterfaceC4352cp4 interfaceC4352cp4) {
        this.k = selectFileDialog;
        this.h = bool;
        this.i = windowAndroid;
        this.j = interfaceC4352cp4;
    }
}
