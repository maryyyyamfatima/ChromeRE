package defpackage;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YF2 implements GF2 {
    public final C5191fG2 a;
    public final C4504dG2 b;

    @Override // defpackage.GF2
    public final void onDestroy() {
    }

    public YF2(Activity activity, DF2 df2, String str, WindowAndroid windowAndroid) {
        PropertyModel propertyModel = new PropertyModel(AbstractC5879hG2.f);
        C4504dG2 c4504dG2 = new C4504dG2(activity, propertyModel, df2, str, windowAndroid);
        this.b = c4504dG2;
        C5191fG2 c5191fG2 = new C5191fG2(activity, new View.OnClickListener() { // from class: XF2
            public /* synthetic */ XF2() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WindowAndroid windowAndroid2;
                final C4504dG2 c4504dG22 = C4504dG2.this;
                c4504dG22.getClass();
                FI2.a("SharingQRCode.DownloadQRCode");
                if (c4504dG22.d > 0) {
                    FI2.a("SharingQRCode.DownloadQRCodeMultipleAttempts");
                }
                c4504dG22.d++;
                if (((Bitmap) c4504dG22.b.i(AbstractC5879hG2.a)) == null || c4504dG22.e || (windowAndroid2 = c4504dG22.c) == null) {
                    return;
                }
                AbstractC7281lM0.a(windowAndroid2, new C6937kM0(new Callback() { // from class: ZF2
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        C4504dG2 c4504dG23 = C4504dG2.this;
                        if (!booleanValue) {
                            c4504dG23.getClass();
                            return;
                        }
                        c4504dG23.a();
                        Bitmap bitmap = (Bitmap) c4504dG23.b.i(AbstractC5879hG2.a);
                        Object[] objArr = {String.valueOf(System.currentTimeMillis())};
                        Context context = c4504dG23.a;
                        String string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140916, objArr);
                        c4504dG23.e = true;
                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0806b1);
                        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0807c9);
                        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08072e);
                        int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08082a);
                        int dimensionPixelSize5 = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080829);
                        TextPaint textPaint = new TextPaint();
                        textPaint.setAntiAlias(true);
                        textPaint.setColor(-16777216);
                        textPaint.setTextSize(dimensionPixelSize2);
                        C4160cG2 c4160cG2 = new C4160cG2(c4504dG23.f, textPaint, dimensionPixelSize, Layout.Alignment.ALIGN_CENTER);
                        Bitmap createBitmap = Bitmap.createBitmap((dimensionPixelSize3 * 2) + dimensionPixelSize, ((c4160cG2.getHeight() + dimensionPixelSize4 + dimensionPixelSize5) * 2) + dimensionPixelSize, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        canvas.drawColor(-1);
                        canvas.translate(dimensionPixelSize3, dimensionPixelSize4);
                        c4160cG2.draw(canvas);
                        canvas.drawBitmap(Bitmap.createScaledBitmap(bitmap, dimensionPixelSize, dimensionPixelSize, false), 0.0f, c4160cG2.getHeight() + dimensionPixelSize5, textPaint);
                        N.MTm9IWhH(string, createBitmap);
                        c4504dG23.g.run();
                    }
                }));
            }
        });
        this.a = c5191fG2;
        UD2.a(propertyModel, c5191fG2, new C5535gG2());
    }

    @Override // defpackage.GF2
    public final View a() {
        return this.a.b;
    }

    @Override // defpackage.GF2
    public final void b(WindowAndroid windowAndroid) {
        C4504dG2 c4504dG2 = this.b;
        if (c4504dG2 != null) {
            c4504dG2.c = windowAndroid;
            c4504dG2.a();
        }
    }

    @Override // defpackage.GF2
    public final void onResume() {
        C4504dG2 c4504dG2 = this.b;
        c4504dG2.a();
        c4504dG2.b.k(AbstractC5879hG2.e, true);
        FI2.a("SharingQRCode.TabVisible.Share");
    }

    @Override // defpackage.GF2
    public final void onPause() {
        this.b.b.k(AbstractC5879hG2.e, false);
    }
}
