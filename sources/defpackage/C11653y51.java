package defpackage;

import J.N;
import android.content.Context;
import android.graphics.PointF;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Arrays;
import org.chromium.chrome.browser.image_editor.text.TextEditorHandleView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: y51 */
/* loaded from: classes5.dex */
public final class C11653y51 {
    public final C11996z51 a;
    public final TextEditorHandleView b;

    public C11653y51(Context context, View view, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        PropertyModel propertyModel = new PropertyModel(new ArrayList(Arrays.asList(B51.l)));
        this.a = new C11996z51(context, propertyModel, runnable, runnable2, runnable3);
        TextEditorHandleView textEditorHandleView = (TextEditorHandleView) view.findViewById(R.id.edit_text);
        this.b = textEditorHandleView;
        UD2.a(propertyModel, textEditorHandleView, new TD2() { // from class: w51
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel2 = (PropertyModel) wd2;
                final TextEditorHandleView textEditorHandleView2 = (TextEditorHandleView) obj;
                FD2 fd2 = (FD2) obj2;
                LD2 ld2 = B51.a;
                if (ld2 == fd2) {
                    boolean j = propertyModel2.j(ld2);
                    textEditorHandleView2.m = j;
                    if (j) {
                        textEditorHandleView2.animate().cancel();
                        textEditorHandleView2.setAlpha(1.0f);
                        textEditorHandleView2.setVisibility(0);
                        return;
                    }
                    textEditorHandleView2.animate().alpha(0.0f).setDuration(100L).withEndAction(new Runnable() { // from class: WH3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i = TextEditorHandleView.n;
                            TextEditorHandleView textEditorHandleView3 = TextEditorHandleView.this;
                            textEditorHandleView3.setVisibility(8);
                            textEditorHandleView3.setAlpha(1.0f);
                        }
                    });
                    return;
                }
                PD2 pd2 = B51.b;
                if (pd2 == fd2) {
                    C8066ne3 c8066ne3 = (C8066ne3) propertyModel2.i(pd2);
                    FrameLayout frameLayout = (FrameLayout) textEditorHandleView2.getParent();
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams.width = (int) TypedValue.applyDimension(1, c8066ne3.a, textEditorHandleView2.getResources().getDisplayMetrics());
                    frameLayout.setLayoutParams(layoutParams);
                    return;
                }
                PD2 pd22 = B51.c;
                if (pd22 != fd2) {
                    ND2 nd2 = B51.d;
                    if (nd2 == fd2) {
                        int h = propertyModel2.h(nd2);
                        FrameLayout frameLayout2 = (FrameLayout) textEditorHandleView2.getParent();
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
                        int i = (layoutParams2.width - h) - 500;
                        if (i >= 0) {
                            i = 0;
                        }
                        layoutParams2.setMargins(0, 0, (int) TypedValue.applyDimension(1, i, textEditorHandleView2.getResources().getDisplayMetrics()), 0);
                        frameLayout2.setLayoutParams(layoutParams2);
                        return;
                    }
                    MD2 md2 = B51.e;
                    if (md2 == fd2) {
                        textEditorHandleView2.setRotation(propertyModel2.g(md2));
                        return;
                    }
                    PD2 pd23 = B51.g;
                    if (pd23 == fd2) {
                        textEditorHandleView2.setText((CharSequence) propertyModel2.i(pd23));
                        return;
                    }
                    ND2 nd22 = B51.h;
                    if (nd22 == fd2) {
                        textEditorHandleView2.setTextColor(propertyModel2.h(nd22));
                        return;
                    }
                    MD2 md22 = B51.i;
                    if (md22 == fd2) {
                        textEditorHandleView2.setTextSize(0, propertyModel2.g(md22));
                        return;
                    }
                    PD2 pd24 = B51.j;
                    if (pd24 != fd2) {
                        LD2 ld22 = B51.k;
                        if (ld22 == fd2) {
                            boolean j2 = propertyModel2.j(ld22);
                            float g = propertyModel2.g(md22);
                            textEditorHandleView2.getClass();
                            C7928nE c7928nE = UN.a;
                            if (N.M09VlOh_("ScreenshotsForAndroidV2") && j2) {
                                float f = g * 0.04f;
                                textEditorHandleView2.setShadowLayer(f, f, f, -14013910);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    textEditorHandleView2.k = (C11996z51) propertyModel2.i(pd24);
                    return;
                }
                textEditorHandleView2.l = (PointF) propertyModel2.i(pd22);
                textEditorHandleView2.a();
            }
        });
    }

    public final void a() {
        LD2 ld2 = B51.a;
        PropertyModel propertyModel = this.a.a;
        propertyModel.k(ld2, false);
        propertyModel.k(B51.k, false);
    }
}
