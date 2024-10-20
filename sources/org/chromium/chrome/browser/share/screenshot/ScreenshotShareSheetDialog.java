package org.chromium.chrome.browser.share.screenshot;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.ViewGroup;
import com.android.chrome.R;
import defpackage.C5490g8;
import defpackage.CX2;
import defpackage.DX2;
import defpackage.DialogInterfaceOnCancelListenerC7423lm0;
import defpackage.EX2;
import defpackage.FD2;
import defpackage.PD2;
import defpackage.QO;
import defpackage.TD2;
import defpackage.UD2;
import defpackage.WD2;
import java.util.ArrayList;
import java.util.Arrays;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.share.screenshot.ScreenshotShareSheetDialog;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.widget.ChromeImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ScreenshotShareSheetDialog extends DialogInterfaceOnCancelListenerC7423lm0 {
    public Context r0;
    public Bitmap s0;
    public WindowAndroid t0;
    public String u0;
    public QO v0;
    public Callback w0;

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void f0(Context context) {
        super.f0(context);
        this.r0 = context;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [zX2] */
    /* JADX WARN: Type inference failed for: r6v0, types: [yX2] */
    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0
    public final Dialog M0(Bundle bundle) {
        C5490g8 c5490g8 = new C5490g8(getActivity(), R.style.f105230_resource_name_obfuscated_res_0x7f150548);
        ScreenshotShareSheetView screenshotShareSheetView = (ScreenshotShareSheetView) getActivity().getLayoutInflater().inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0255, (ViewGroup) null);
        c5490g8.a.q = screenshotShareSheetView;
        Context context = this.r0;
        Bitmap bitmap = this.s0;
        ?? r5 = new Runnable() { // from class: zX2
            @Override // java.lang.Runnable
            public final void run() {
                ScreenshotShareSheetDialog.this.dismissAllowingStateLoss();
            }
        };
        WindowAndroid windowAndroid = this.t0;
        String str = this.u0;
        QO qo = this.v0;
        Callback callback = this.w0;
        PropertyModel propertyModel = new PropertyModel(new ArrayList(Arrays.asList(EX2.c)));
        propertyModel.o(EX2.b, bitmap);
        final DX2 dx2 = new DX2(context, propertyModel, r5, windowAndroid);
        new CX2(context, propertyModel, r5, new Runnable() { // from class: yX2
            @Override // java.lang.Runnable
            public final void run() {
                PD2 pd2 = EX2.b;
                DX2 dx22 = DX2.this;
                Bitmap bitmap2 = (Bitmap) dx22.a.i(pd2);
                if (bitmap2 == null) {
                    return;
                }
                new VU2(dx22.b, bitmap2, R.string.0_resource_name_obfuscated_res_0x7f1409b2, dx22.d, dx22.c).a();
            }
        }, windowAndroid, str, qo, callback);
        UD2.a(propertyModel, screenshotShareSheetView, new TD2() { // from class: org.chromium.chrome.browser.share.screenshot.a
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel2 = (PropertyModel) wd2;
                ScreenshotShareSheetView screenshotShareSheetView2 = (ScreenshotShareSheetView) obj;
                FD2 fd2 = (FD2) obj2;
                PD2 pd2 = EX2.a;
                if (pd2 == fd2) {
                    Callback callback2 = (Callback) propertyModel2.i(pd2);
                    screenshotShareSheetView2.a(1, R.id.share, callback2);
                    screenshotShareSheetView2.a(2, R.id.save, callback2);
                    screenshotShareSheetView2.a(3, R.id.delete, callback2);
                    screenshotShareSheetView2.a(3, R.id.close_button, callback2);
                    screenshotShareSheetView2.a(4, R.id.edit, callback2);
                    return;
                }
                PD2 pd22 = EX2.b;
                if (pd22 == fd2) {
                    ((ChromeImageView) screenshotShareSheetView2.findViewById(R.id.screenshot)).setImageDrawable(new BitmapDrawable((Bitmap) propertyModel2.i(pd22)));
                }
            }
        });
        return c5490g8.a();
    }
}
