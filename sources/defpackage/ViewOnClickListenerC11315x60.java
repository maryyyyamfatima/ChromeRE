package defpackage;

import J.N;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.contextmenu.ContextMenuNativeDelegateImpl;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.embedder_support.contextmenu.ContextMenuParams;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: x60 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC11315x60 implements View.OnClickListener {
    public final PropertyModel a;
    public final Context g;
    public final GURL h;

    public ViewOnClickListenerC11315x60(Context context, PropertyModel propertyModel, int i, ContextMenuParams contextMenuParams, Profile profile, ContextMenuNativeDelegateImpl contextMenuNativeDelegateImpl) {
        this.g = context;
        GURL a = contextMenuParams.a();
        this.h = a;
        this.a = propertyModel;
        propertyModel.o(AbstractC11658y60.d, this);
        if (!propertyModel.j(AbstractC11658y60.i)) {
            boolean z = contextMenuParams.j;
            if (z) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08013e);
                Callback callback = new Callback() { // from class: v60
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        Bitmap bitmap = (Bitmap) obj;
                        ViewOnClickListenerC11315x60 viewOnClickListenerC11315x60 = ViewOnClickListenerC11315x60.this;
                        if (bitmap == null) {
                            viewOnClickListenerC11315x60.getClass();
                            return;
                        }
                        Resources resources = viewOnClickListenerC11315x60.g.getResources();
                        Drawable c = AbstractC9771sd.c(resources, R.drawable.0_resource_name_obfuscated_res_0x7f09011a, 0);
                        Bitmap createBitmap = Bitmap.createBitmap(c.getIntrinsicWidth(), c.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        c.setBounds(0, 0, c.getIntrinsicWidth(), c.getIntrinsicHeight());
                        c.draw(canvas);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, createBitmap);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        bitmapDrawable.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        Bitmap createBitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(createBitmap2);
                        bitmapDrawable.draw(canvas2);
                        Paint paint = new Paint();
                        paint.setAntiAlias(true);
                        canvas2.drawBitmap(bitmap, new Matrix(), paint);
                        viewOnClickListenerC11315x60.a(createBitmap2, true);
                    }
                };
                long j = contextMenuNativeDelegateImpl.b;
                if (j != 0) {
                    N.MrTfYLQo(j, contextMenuNativeDelegateImpl, contextMenuNativeDelegateImpl.a, callback, dimensionPixelSize, dimensionPixelSize);
                }
            } else {
                boolean z2 = contextMenuParams.k;
                if (!z && !z2) {
                    new LargeIconBridge(profile).b(a, context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080179), new LargeIconBridge.LargeIconCallback() { // from class: w60
                        @Override // org.chromium.components.favicon.LargeIconBridge.LargeIconCallback
                        public final void onLargeIconAvailable(Bitmap bitmap, int i2, boolean z3, int i3) {
                            ViewOnClickListenerC11315x60 viewOnClickListenerC11315x60 = ViewOnClickListenerC11315x60.this;
                            if (bitmap == null) {
                                int dimensionPixelSize2 = viewOnClickListenerC11315x60.g.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08013f);
                                bitmap = new C6964kR2(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2 / 2, i2, r8.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080140)).b(viewOnClickListenerC11315x60.h.i(), false);
                                if (bitmap == null) {
                                    return;
                                }
                            }
                            int h = viewOnClickListenerC11315x60.a.h(AbstractC11658y60.j);
                            viewOnClickListenerC11315x60.a(Bitmap.createScaledBitmap(bitmap, h, h, true), false);
                        }
                    });
                } else if (z2) {
                    Drawable c = AbstractC9771sd.c(context.getResources(), R.drawable.0_resource_name_obfuscated_res_0x7f090198, 0);
                    c.setColorFilter(AbstractC10957w33.c(context), PorterDuff.Mode.SRC_IN);
                    Bitmap createBitmap = Bitmap.createBitmap(c.getIntrinsicWidth(), c.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    c.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    c.draw(canvas);
                    a(createBitmap, false);
                }
            }
        }
        if (N.MvtoTww2() && contextMenuParams.i) {
            propertyModel.m(AbstractC11658y60.h, i);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EI2.b("ContextMenu.URLClicked", true);
        ND2 nd2 = AbstractC11658y60.e;
        PropertyModel propertyModel = this.a;
        int h = propertyModel.h(nd2);
        ND2 nd22 = AbstractC11658y60.b;
        if (h == Integer.MAX_VALUE) {
            propertyModel.m(nd2, TextUtils.isEmpty((CharSequence) propertyModel.i(AbstractC11658y60.a)) ? 2 : 1);
            propertyModel.m(nd22, TextUtils.isEmpty((CharSequence) propertyModel.i(AbstractC11658y60.c)) ? 2 : 1);
        } else {
            propertyModel.m(nd2, Integer.MAX_VALUE);
            propertyModel.m(nd22, Integer.MAX_VALUE);
        }
    }

    public final void a(Bitmap bitmap, boolean z) {
        PD2 pd2 = AbstractC11658y60.f;
        PropertyModel propertyModel = this.a;
        if (z) {
            propertyModel.o(pd2, bitmap);
        } else {
            propertyModel.k(AbstractC11658y60.g, true);
            propertyModel.o(pd2, bitmap);
        }
    }
}
