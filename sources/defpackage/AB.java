package defpackage;

import J.N;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Arrays;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.image_editor.bottom_bar.BottomBarView;
import org.chromium.chrome.browser.image_editor.bottom_bar.ColorSelectorView;
import org.chromium.chrome.browser.image_editor.bottom_bar.CropToolView;
import org.chromium.chrome.browser.image_editor.bottom_bar.LineToolView;
import org.chromium.chrome.browser.image_editor.bottom_bar.ShapeToolView;
import org.chromium.chrome.browser.image_editor.bottom_bar.TextToolView;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.widget.ChromeImageButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class AB {
    public final CB a;
    public final DB1 b;
    public final C2085Qb0 c;
    public final C10701vJ3 d;
    public final C9260r63 e;
    public final Callback f;

    public AB(Context context, View view, C2786Vl1 c2786Vl1, Callback callback) {
        PropertyModel propertyModel = new PropertyModel(new ArrayList(Arrays.asList(DB.d)));
        this.a = new CB(new Callback() { // from class: xB
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                VR3 vr3 = (VR3) obj;
                AB ab = AB.this;
                ab.f.onResult(Boolean.FALSE);
                ab.a.a.k(DB.b, false);
                DB1 db1 = ab.b;
                LineToolView lineToolView = db1.f;
                LD2 ld2 = HB1.c;
                if (lineToolView != null) {
                    db1.b.a.k(ld2, false);
                }
                C2085Qb0 c2085Qb0 = ab.c;
                CropToolView cropToolView = c2085Qb0.b;
                LD2 ld22 = AbstractC2475Tb0.a;
                if (cropToolView != null) {
                    c2085Qb0.a.a.k(ld22, false);
                }
                C10701vJ3 c10701vJ3 = ab.d;
                TextToolView textToolView = c10701vJ3.f;
                LD2 ld23 = AbstractC11730yJ3.a;
                if (textToolView != null) {
                    c10701vJ3.c.a.k(ld23, false);
                }
                C9260r63 c9260r63 = ab.e;
                ShapeToolView shapeToolView = c9260r63.f;
                LD2 ld24 = AbstractC10289u63.a;
                if (shapeToolView != null) {
                    c9260r63.c.a.k(ld24, false);
                }
                VR3 vr32 = VR3.h;
                ND2 nd2 = SW.d;
                FD2[] fd2Arr = SW.e;
                if (vr32 == vr3) {
                    db1.getClass();
                    AbstractC9454rh1.a(2);
                    if (db1.f == null) {
                        LineToolView lineToolView2 = (LineToolView) ((ViewStub) db1.c.findViewById(R.id.linetool_stub)).inflate();
                        db1.f = lineToolView2;
                        lineToolView2.findViewById(R.id.undo_redo).setVisibility(0);
                        LineToolView lineToolView3 = db1.f;
                        PropertyModel propertyModel2 = new PropertyModel(fd2Arr);
                        propertyModel2.m(nd2, 1);
                        new RW(db1.a, propertyModel2, db1.e);
                        UD2.a(propertyModel2, (ColorSelectorView) lineToolView3.findViewById(R.id.color_row), new NW());
                        UD2.a(db1.d, db1.f, new TD2() { // from class: CB1
                            @Override // defpackage.TD2
                            public final void d(WD2 wd2, Object obj2, Object obj3) {
                                PropertyModel propertyModel3 = (PropertyModel) wd2;
                                LineToolView lineToolView4 = (LineToolView) obj2;
                                FD2 fd2 = (FD2) obj3;
                                LD2 ld25 = HB1.a;
                                if (ld25 != fd2) {
                                    LD2 ld26 = HB1.b;
                                    if (ld26 != fd2) {
                                        PD2 pd2 = HB1.e;
                                        if (pd2 == fd2) {
                                            Callback callback2 = (Callback) propertyModel3.i(pd2);
                                            lineToolView4.a(1, R.id.undo, callback2);
                                            lineToolView4.a(2, R.id.redo, callback2);
                                            lineToolView4.a(3, R.id.commit_tool, callback2);
                                            lineToolView4.a(4, R.id.close_tool, callback2);
                                            return;
                                        }
                                        LD2 ld27 = HB1.c;
                                        if (ld27 == fd2) {
                                            boolean j = propertyModel3.j(ld27);
                                            lineToolView4.getClass();
                                            lineToolView4.setVisibility(j ? 0 : 8);
                                            return;
                                        }
                                        MD2 md2 = HB1.d;
                                        if (md2 == fd2) {
                                            float g = propertyModel3.g(md2);
                                            ((SeekBar) lineToolView4.findViewById(R.id.line_size)).setProgress(Math.round(((g - 0.3f) * r5.getMax()) / 0.5f));
                                            return;
                                        } else {
                                            PD2 pd22 = HB1.f;
                                            if (pd22 == fd2) {
                                                ((SeekBar) lineToolView4.findViewById(R.id.line_size)).setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) propertyModel3.i(pd22));
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    ((ChromeImageButton) lineToolView4.findViewById(R.id.undo)).setEnabled(propertyModel3.j(ld26));
                                    return;
                                }
                                ((ChromeImageButton) lineToolView4.findViewById(R.id.redo)).setEnabled(propertyModel3.j(ld25));
                            }
                        });
                    }
                    GB1 gb1 = db1.b;
                    gb1.a.k(ld2, true);
                    gb1.b.i(vr32);
                    return;
                }
                VR3 vr33 = VR3.n;
                if (vr33 == vr3) {
                    c2085Qb0.getClass();
                    AbstractC9454rh1.a(0);
                    if (c2085Qb0.b == null) {
                        CropToolView cropToolView2 = (CropToolView) ((ViewStub) c2085Qb0.c.findViewById(R.id.croptool_stub)).inflate();
                        c2085Qb0.b = cropToolView2;
                        TextView textView = (TextView) cropToolView2.findViewById(R.id.tool_title);
                        textView.setVisibility(0);
                        textView.setText(cropToolView2.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1403db));
                        UD2.a(c2085Qb0.d, c2085Qb0.b, new TD2() { // from class: Pb0
                            @Override // defpackage.TD2
                            public final void d(WD2 wd2, Object obj2, Object obj3) {
                                PropertyModel propertyModel3 = (PropertyModel) wd2;
                                CropToolView cropToolView3 = (CropToolView) obj2;
                                FD2 fd2 = (FD2) obj3;
                                PD2 pd2 = AbstractC2475Tb0.b;
                                if (pd2 == fd2) {
                                    final Callback callback2 = (Callback) propertyModel3.i(pd2);
                                    final Integer i = 1;
                                    ((ChromeImageButton) cropToolView3.findViewById(R.id.commit_tool)).setOnClickListener(new View.OnClickListener() { // from class: Ub0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            int i22 = CropToolView.a;
                                            Callback.this.onResult(i);
                                        }
                                    });
                                    final Integer i2 = 2;
                                    ((ChromeImageButton) cropToolView3.findViewById(R.id.close_tool)).setOnClickListener(new View.OnClickListener() { // from class: Ub0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            int i22 = CropToolView.a;
                                            Callback.this.onResult(i2);
                                        }
                                    });
                                    return;
                                }
                                LD2 ld25 = AbstractC2475Tb0.a;
                                if (ld25 == fd2) {
                                    boolean j = propertyModel3.j(ld25);
                                    cropToolView3.getClass();
                                    cropToolView3.setVisibility(j ? 0 : 8);
                                }
                            }
                        });
                    }
                    C2345Sb0 c2345Sb0 = c2085Qb0.a;
                    c2345Sb0.a.k(ld22, true);
                    c2345Sb0.b.i(vr33);
                    return;
                }
                VR3 vr34 = VR3.s;
                if (vr34 == vr3) {
                    c10701vJ3.getClass();
                    AbstractC9454rh1.a(1);
                    if (c10701vJ3.f == null) {
                        TextToolView textToolView2 = (TextToolView) ((ViewStub) c10701vJ3.d.findViewById(R.id.texttool_stub)).inflate();
                        c10701vJ3.f = textToolView2;
                        TextView textView2 = (TextView) textToolView2.findViewById(R.id.tool_title);
                        textView2.setVisibility(0);
                        textView2.setText(textToolView2.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140b29));
                        c10701vJ3.g = new OW(c10701vJ3.a, c10701vJ3.f, c10701vJ3.b);
                        UD2.a(c10701vJ3.e, c10701vJ3.f, new TD2() { // from class: uJ3
                            @Override // defpackage.TD2
                            public final void d(WD2 wd2, Object obj2, Object obj3) {
                                PropertyModel propertyModel3 = (PropertyModel) wd2;
                                TextToolView textToolView3 = (TextToolView) obj2;
                                FD2 fd2 = (FD2) obj3;
                                PD2 pd2 = AbstractC11730yJ3.b;
                                if (pd2 == fd2) {
                                    final Callback callback2 = (Callback) propertyModel3.i(pd2);
                                    final Integer i = 1;
                                    ((ChromeImageButton) textToolView3.findViewById(R.id.commit_tool)).setOnClickListener(new View.OnClickListener() { // from class: zJ3
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            int i22 = TextToolView.a;
                                            Callback.this.onResult(i);
                                        }
                                    });
                                    final Integer i2 = 2;
                                    ((ChromeImageButton) textToolView3.findViewById(R.id.close_tool)).setOnClickListener(new View.OnClickListener() { // from class: zJ3
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            int i22 = TextToolView.a;
                                            Callback.this.onResult(i2);
                                        }
                                    });
                                    return;
                                }
                                LD2 ld25 = AbstractC11730yJ3.a;
                                if (ld25 == fd2) {
                                    boolean j = propertyModel3.j(ld25);
                                    textToolView3.getClass();
                                    textToolView3.setVisibility(j ? 0 : 8);
                                }
                            }
                        });
                    }
                    C11387xJ3 c11387xJ3 = c10701vJ3.c;
                    c11387xJ3.a.k(ld23, true);
                    c11387xJ3.b.i(vr34);
                    return;
                }
                VR3 vr35 = VR3.y;
                if (vr35 == vr3) {
                    c9260r63.getClass();
                    AbstractC9454rh1.a(15);
                    if (c9260r63.f == null) {
                        ShapeToolView shapeToolView2 = (ShapeToolView) ((ViewStub) c9260r63.d.findViewById(R.id.shapetool_stub)).inflate();
                        c9260r63.f = shapeToolView2;
                        shapeToolView2.findViewById(R.id.shape_tool_buttons).setVisibility(0);
                        ShapeToolView shapeToolView3 = c9260r63.f;
                        PropertyModel propertyModel3 = new PropertyModel(fd2Arr);
                        propertyModel3.m(nd2, 3);
                        new RW(c9260r63.a, propertyModel3, c9260r63.b);
                        UD2.a(propertyModel3, (ColorSelectorView) shapeToolView3.findViewById(R.id.color_row), new NW());
                        UD2.a(c9260r63.e, c9260r63.f, new TD2() { // from class: q63
                            @Override // defpackage.TD2
                            public final void d(WD2 wd2, Object obj2, Object obj3) {
                                PropertyModel propertyModel4 = (PropertyModel) wd2;
                                ShapeToolView shapeToolView4 = (ShapeToolView) obj2;
                                FD2 fd2 = (FD2) obj3;
                                PD2 pd2 = AbstractC10289u63.c;
                                if (pd2 == fd2) {
                                    Callback callback2 = (Callback) propertyModel4.i(pd2);
                                    shapeToolView4.b(1, R.id.commit_tool, callback2);
                                    shapeToolView4.b(2, R.id.close_tool, callback2);
                                    shapeToolView4.b(3, R.id.oval, callback2);
                                    shapeToolView4.b(4, R.id.rectangle, callback2);
                                    shapeToolView4.b(5, R.id.arrow, callback2);
                                    return;
                                }
                                LD2 ld25 = AbstractC10289u63.a;
                                if (ld25 == fd2) {
                                    boolean j = propertyModel4.j(ld25);
                                    shapeToolView4.getClass();
                                    shapeToolView4.setVisibility(j ? 0 : 8);
                                    return;
                                }
                                ND2 nd22 = AbstractC10289u63.b;
                                if (nd22 == fd2) {
                                    int h = propertyModel4.h(nd22);
                                    shapeToolView4.getClass();
                                    if (h < 1 || h > 3) {
                                        return;
                                    }
                                    int i = shapeToolView4.a;
                                    if (i != -1) {
                                        shapeToolView4.a(i).clearColorFilter();
                                    }
                                    shapeToolView4.a(h).setColorFilter(new PorterDuffColorFilter(shapeToolView4.getResources().getColor(R.color.0_resource_name_obfuscated_res_0x7f0700ff), PorterDuff.Mode.SRC_ATOP));
                                    shapeToolView4.a = h;
                                }
                            }
                        });
                    }
                    C9946t63 c9946t63 = c9260r63.c;
                    c9946t63.a.k(ld24, true);
                    c9946t63.b.i(vr35);
                }
            }
        }, propertyModel);
        BottomBarView bottomBarView = (BottomBarView) view.findViewById(R.id.image_editor_bottom_bar);
        this.b = new DB1(context, bottomBarView, c2786Vl1, new Runnable() { // from class: yB
            @Override // java.lang.Runnable
            public final void run() {
                AB.this.a();
            }
        });
        this.c = new C2085Qb0(bottomBarView, c2786Vl1, new Runnable() { // from class: yB
            @Override // java.lang.Runnable
            public final void run() {
                AB.this.a();
            }
        });
        this.d = new C10701vJ3(context, bottomBarView, c2786Vl1, new Runnable() { // from class: yB
            @Override // java.lang.Runnable
            public final void run() {
                AB.this.a();
            }
        });
        this.e = new C9260r63(context, bottomBarView, c2786Vl1, new Runnable() { // from class: yB
            @Override // java.lang.Runnable
            public final void run() {
                AB.this.a();
            }
        });
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("ScreenshotsForAndroidV2")) {
            bottomBarView.findViewById(R.id.shape).setVisibility(0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            layoutParams.weight = 1.0f;
            layoutParams.gravity = 17;
            bottomBarView.findViewById(R.id.draw).setLayoutParams(layoutParams);
        }
        this.f = callback;
        UD2.a(propertyModel, bottomBarView, new TD2() { // from class: zB
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel2 = (PropertyModel) wd2;
                BottomBarView bottomBarView2 = (BottomBarView) obj;
                FD2 fd2 = (FD2) obj2;
                LD2 ld2 = DB.a;
                if (ld2 == fd2) {
                    bottomBarView2.setVisibility(propertyModel2.j(ld2) ? 0 : 8);
                    return;
                }
                PD2 pd2 = DB.c;
                if (pd2 == fd2) {
                    Callback callback2 = (Callback) propertyModel2.i(pd2);
                    bottomBarView2.a(VR3.n, R.id.crop, callback2);
                    bottomBarView2.a(VR3.s, R.id.text, callback2);
                    bottomBarView2.a(VR3.h, R.id.draw, callback2);
                    bottomBarView2.a(VR3.y, R.id.shape, callback2);
                    return;
                }
                LD2 ld22 = DB.b;
                if (ld22 == fd2) {
                    bottomBarView2.findViewById(R.id.tool_select).setVisibility(propertyModel2.j(ld22) ? 0 : 8);
                }
            }
        });
    }

    public final void a() {
        this.f.onResult(Boolean.TRUE);
        DB1 db1 = this.b;
        if (db1.f != null) {
            db1.b.a.k(HB1.c, false);
        }
        C2085Qb0 c2085Qb0 = this.c;
        if (c2085Qb0.b != null) {
            c2085Qb0.a.a.k(AbstractC2475Tb0.a, false);
        }
        C10701vJ3 c10701vJ3 = this.d;
        if (c10701vJ3.f != null) {
            c10701vJ3.c.a.k(AbstractC11730yJ3.a, false);
        }
        C9260r63 c9260r63 = this.e;
        if (c9260r63.f != null) {
            c9260r63.c.a.k(AbstractC10289u63.a, false);
        }
        this.a.a.k(DB.b, true);
    }
}
