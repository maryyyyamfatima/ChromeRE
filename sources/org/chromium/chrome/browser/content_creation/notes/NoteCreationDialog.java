package org.chromium.chrome.browser.content_creation.notes;

import J.N;
import android.app.Dialog;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LeadingMarginSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.chrome.R;
import defpackage.AbstractC3763b62;
import defpackage.C2591Ty1;
import defpackage.C4652di2;
import defpackage.C5490g8;
import defpackage.C7616mK1;
import defpackage.C7928nE;
import defpackage.DialogInterfaceOnCancelListenerC7423lm0;
import defpackage.K52;
import defpackage.P52;
import defpackage.S52;
import defpackage.T52;
import defpackage.TD2;
import defpackage.UN;
import defpackage.V52;
import defpackage.ZN3;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.content_creation.notes.LineLimitedTextView;
import org.chromium.chrome.browser.content_creation.notes.NoteCreationDialog;
import org.chromium.chrome.browser.content_creation.notes.top_bar.TopBarView;
import org.chromium.components.content_creation.notes.bridges.NoteServiceBridge;
import org.chromium.components.content_creation.notes.models.Background;
import org.chromium.components.content_creation.notes.models.NoteTemplate;
import org.chromium.components.content_creation.notes.models.TextStyle;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class NoteCreationDialog extends DialogInterfaceOnCancelListenerC7423lm0 {
    public static final /* synthetic */ int C0 = 0;
    public Runnable A0;
    public K52 B0;
    public View r0;
    public String s0;
    public String t0;
    public String u0;
    public int v0;
    public ZN3 w0;
    public boolean x0;
    public int y0;
    public boolean z0;

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public final void g0(Bundle bundle) {
        super.g0(bundle);
        if (this.z0) {
            return;
        }
        L0(false, false);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [jS3] */
    /* JADX WARN: Type inference failed for: r4v1, types: [hS3] */
    /* JADX WARN: Type inference failed for: r4v2, types: [iS3] */
    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0
    public final Dialog M0(Bundle bundle) {
        C5490g8 c5490g8 = new C5490g8(getActivity(), R.style.f105230_resource_name_obfuscated_res_0x7f150548);
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.f56750_resource_name_obfuscated_res_0x7f0e00ab, (ViewGroup) null);
        this.r0 = inflate;
        c5490g8.a.q = inflate;
        V0();
        R0();
        if (this.x0) {
            ((Button) this.r0.findViewById(R.id.publish)).setVisibility(0);
        }
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("WebNotesDynamicTemplates")) {
            View findViewById = this.r0.findViewById(R.id.title);
            ((ViewGroup) findViewById.getParent()).removeView(findViewById);
        }
        K52 k52 = this.B0;
        if (k52 != null) {
            View view = this.r0;
            final P52 p52 = k52.a;
            p52.getClass();
            TopBarView topBarView = (TopBarView) view.findViewById(R.id.top_bar);
            final ?? r4 = new Runnable() { // from class: hS3
                @Override // java.lang.Runnable
                public final void run() {
                    P52 p522 = (P52) p52;
                    p522.getClass();
                    long currentTimeMillis = System.currentTimeMillis() - p522.i;
                    NoteCreationDialog noteCreationDialog = p522.e;
                    int i = noteCreationDialog.y0;
                    EI2.k(currentTimeMillis, "NoteCreation.TimeTo.DismissCreationDialog");
                    EI2.b("NoteCreation.CreationStatus", false);
                    EI2.d(i, "NoteCreation.NumberOfTemplateChanges");
                    noteCreationDialog.L0(false, false);
                }
            };
            topBarView.findViewById(R.id.close).setOnClickListener(new View.OnClickListener() { // from class: sS3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i = TopBarView.a;
                    r4.run();
                }
            });
            final ?? r42 = new Runnable() { // from class: iS3
                @Override // java.lang.Runnable
                public final void run() {
                    final P52 p522 = (P52) p52;
                    String str = p522.h;
                    String str2 = p522.g;
                    Callback callback = new Callback() { // from class: N52
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj) {
                            return new ZE(this, obj);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj) {
                            String str3;
                            String str4 = (String) obj;
                            P52 p523 = P52.this;
                            String b = p523.b();
                            WindowAndroid windowAndroid = p523.b;
                            if (TextUtils.isEmpty(str4)) {
                                str3 = str4;
                            } else {
                                str3 = TextUtils.isEmpty(str4) ? str4 : ((GURL) N.M1WDPiaY(str4)).i();
                            }
                            C6862k73 c6862k73 = new C6862k73(windowAndroid, b, null, null, str3, null, null, null, null, null, null, null, null, null);
                            long currentTimeMillis = System.currentTimeMillis();
                            EP ep = new EP(false, false, false, null, new GURL(str4), false, false, false, null, 5);
                            p523.e.L0(false, false);
                            ((O73) p523.f).m(c6862k73, ep, currentTimeMillis);
                        }
                    };
                    NoteServiceBridge noteServiceBridge = p522.d.b;
                    long j = noteServiceBridge.a;
                    if (j == 0) {
                        return;
                    }
                    N.MUr$U1LW(j, noteServiceBridge, str, str2, callback);
                }
            };
            topBarView.findViewById(R.id.publish).setOnClickListener(new View.OnClickListener() { // from class: rS3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i = TopBarView.a;
                    r42.run();
                }
            });
            final ?? r2 = new Runnable() { // from class: jS3
                @Override // java.lang.Runnable
                public final void run() {
                    ((P52) p52).a();
                }
            };
            topBarView.findViewById(R.id.next).setOnClickListener(new View.OnClickListener() { // from class: qS3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i = TopBarView.a;
                    r2.run();
                }
            });
            C7616mK1 c7616mK1 = p52.c;
            final NoteCreationDialog noteCreationDialog = p52.e;
            RecyclerView recyclerView = (RecyclerView) noteCreationDialog.r0.findViewById(R.id.note_carousel);
            S52 s52 = new S52(c7616mK1);
            s52.Q(1, new C2591Ty1(R.layout.f56330_resource_name_obfuscated_res_0x7f0e007b), new TD2() { // from class: Q52
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.TD2
                public final void d(WD2 wd2, Object obj, Object obj2) {
                    PropertyModel propertyModel = (PropertyModel) wd2;
                    ViewGroup viewGroup = (ViewGroup) obj;
                    int i = NoteCreationDialog.C0;
                    final NoteCreationDialog noteCreationDialog2 = NoteCreationDialog.this;
                    noteCreationDialog2.getClass();
                    PD2 pd2 = AbstractC3763b62.a;
                    if (((Boolean) propertyModel.i(pd2)).booleanValue() && noteCreationDialog2.v0 == 0) {
                        noteCreationDialog2.U0(propertyModel);
                    }
                    PD2 pd22 = AbstractC3763b62.c;
                    NoteTemplate noteTemplate = (NoteTemplate) propertyModel.i(pd22);
                    View findViewById2 = viewGroup.findViewById(R.id.item);
                    noteTemplate.c.a(findViewById2, noteCreationDialog2.getActivity().getResources().getDimensionPixelSize(R.dimen.f37490_resource_name_obfuscated_res_0x7f0805fe));
                    findViewById2.setClipToOutline(true);
                    findViewById2.setContentDescription(noteCreationDialog2.getActivity().getString(R.string.f71200_resource_name_obfuscated_res_0x7f140398, ((NoteTemplate) propertyModel.i(pd22)).b));
                    Typeface typeface = (Typeface) propertyModel.i(AbstractC3763b62.d);
                    LineLimitedTextView lineLimitedTextView = (LineLimitedTextView) viewGroup.findViewById(R.id.text);
                    lineLimitedTextView.setTypeface(typeface);
                    String str = noteCreationDialog2.u0;
                    TextStyle textStyle = noteTemplate.d;
                    lineLimitedTextView.setTextColor(textStyle.c);
                    lineLimitedTextView.setAllCaps(textStyle.d);
                    int i2 = textStyle.e;
                    int b = AbstractC2373Sg3.b(i2);
                    lineLimitedTextView.setGravity((b == 0 || b == 1) ? 8388627 : b != 2 ? b != 3 ? 8388611 : 8388629 : 17);
                    int i3 = Build.VERSION.SDK_INT;
                    int i4 = textStyle.f;
                    int i5 = textStyle.g;
                    if (i3 < 27) {
                        if (lineLimitedTextView instanceof InterfaceC0975Hn) {
                            ((InterfaceC0975Hn) lineLimitedTextView).setAutoSizeTextTypeUniformWithConfiguration(i4, i5, 1, 2);
                        }
                    } else {
                        lineLimitedTextView.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, 1, 2);
                    }
                    int i6 = textStyle.i;
                    int i7 = textStyle.h;
                    if ((i7 == 0 || i6 == 1) ? false : true) {
                        int length = str.length();
                        SpannableString spannableString = new SpannableString(str);
                        spannableString.setSpan(new C11725yI3(i6, i7, i2, lineLimitedTextView.getLayoutDirection() == 1), 0, length, 33);
                        spannableString.setSpan(new LeadingMarginSpan.Standard(10), 0, length, 33);
                        lineLimitedTextView.setText(spannableString, TextView.BufferType.SPANNABLE);
                    } else {
                        lineLimitedTextView.setText(str);
                    }
                    lineLimitedTextView.g = new Runnable() { // from class: R52
                        @Override // java.lang.Runnable
                        public final void run() {
                            NoteCreationDialog noteCreationDialog3 = NoteCreationDialog.this;
                            if (noteCreationDialog3.w0 != null) {
                                return;
                            }
                            ZN3 c = ZN3.c(noteCreationDialog3.getActivity(), noteCreationDialog3.getActivity().getString(R.string.f71190_resource_name_obfuscated_res_0x7f140397), 1);
                            noteCreationDialog3.w0 = c;
                            c.d();
                        }
                    };
                    Background background = noteTemplate.f;
                    if (background != null) {
                        background.a(lineLimitedTextView, noteCreationDialog2.getActivity().getResources().getDimensionPixelSize(R.dimen.f37490_resource_name_obfuscated_res_0x7f0805fe));
                    } else {
                        lineLimitedTextView.setBackground(null);
                    }
                    TextView textView = (TextView) viewGroup.findViewById(R.id.footer_link);
                    TextView textView2 = (TextView) viewGroup.findViewById(R.id.footer_title);
                    ImageView imageView = (ImageView) viewGroup.findViewById(R.id.footer_icon);
                    textView.setText(noteCreationDialog2.s0);
                    textView2.setText(noteCreationDialog2.t0);
                    noteTemplate.e.a(textView, textView2, imageView);
                    boolean booleanValue = ((Boolean) propertyModel.i(pd2)).booleanValue();
                    boolean booleanValue2 = ((Boolean) propertyModel.i(AbstractC3763b62.b)).booleanValue();
                    View findViewById3 = viewGroup.findViewById(R.id.item);
                    int i8 = noteCreationDialog2.getActivity().getResources().getDisplayMetrics().widthPixels;
                    int dimension = (int) noteCreationDialog2.getActivity().getResources().getDimension(R.dimen.f37530_resource_name_obfuscated_res_0x7f080602);
                    int dimension2 = (int) noteCreationDialog2.getActivity().getResources().getDimension(R.dimen.f37500_resource_name_obfuscated_res_0x7f0805ff);
                    int i9 = booleanValue ? (int) (((i8 - dimension) * 0.5f) + 0.5f) : dimension2;
                    if (booleanValue2) {
                        dimension2 = (int) (((i8 - dimension) * 0.5f) + 0.5f);
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById3.getLayoutParams();
                    marginLayoutParams.setMarginStart(i9);
                    marginLayoutParams.setMarginEnd(dimension2);
                    findViewById3.setLayoutParams(marginLayoutParams);
                    findViewById3.requestLayout();
                    findViewById2.setAccessibilityDelegate(new U52(noteCreationDialog2));
                }
            });
            recyclerView.n0(s52);
            noteCreationDialog.getActivity();
            recyclerView.q0(new LinearLayoutManager(0, false));
            new C4652di2().a(recyclerView);
            recyclerView.i(new T52(noteCreationDialog, c7616mK1));
        }
        return c5490g8.a();
    }

    public final View T0(int i) {
        View r;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((RecyclerView) this.r0.findViewById(R.id.note_carousel)).s;
        if (linearLayoutManager == null || (r = linearLayoutManager.r(i)) == null) {
            return null;
        }
        return r.findViewById(R.id.item);
    }

    public final void S0() {
        ((LinearLayoutManager) ((RecyclerView) this.r0.findViewById(R.id.note_carousel)).s).i1(this.v0, ((getActivity().getResources().getDisplayMetrics().widthPixels / 2) - (T0(this.v0).getWidth() / 2)) - getActivity().getResources().getDimensionPixelSize(R.dimen.f37500_resource_name_obfuscated_res_0x7f0805ff));
    }

    public final void V0() {
        int dimensionPixelSize = getActivity().getResources().getDimensionPixelSize(R.dimen.f37510_resource_name_obfuscated_res_0x7f080600);
        int i = getActivity().getResources().getDisplayMetrics().heightPixels;
        int dimensionPixelSize2 = getActivity().getResources().getDimensionPixelSize(R.dimen.f37520_resource_name_obfuscated_res_0x7f080601);
        int dimensionPixelSize3 = getActivity().getResources().getDimensionPixelSize(R.dimen.f37530_resource_name_obfuscated_res_0x7f080602);
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("WebNotesDynamicTemplates")) {
            RelativeLayout relativeLayout = (RelativeLayout) this.r0.findViewById(R.id.main_content);
            relativeLayout.getViewTreeObserver().addOnGlobalLayoutListener(new V52(this, relativeLayout, dimensionPixelSize3));
            return;
        }
        View findViewById = this.r0.findViewById(R.id.title);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
        marginLayoutParams.topMargin = (int) (((i - dimensionPixelSize2) * 0.15f) + dimensionPixelSize);
        findViewById.setLayoutParams(marginLayoutParams);
        findViewById.requestLayout();
    }

    public final void R0() {
        int i = getActivity().getResources().getDisplayMetrics().heightPixels;
        int dimension = (int) getActivity().getResources().getDimension(R.dimen.f35870_resource_name_obfuscated_res_0x7f0804f0);
        if (dimension < i && this.r0.findViewById(R.id.scrollview) != null) {
            LinearLayout linearLayout = (LinearLayout) this.r0.findViewById(R.id.dialog_layout);
            RelativeLayout relativeLayout = (RelativeLayout) linearLayout.findViewById(R.id.main_content);
            ScrollView scrollView = (ScrollView) linearLayout.findViewById(R.id.scrollview);
            scrollView.removeView(relativeLayout);
            linearLayout.removeView(scrollView);
            linearLayout.addView(relativeLayout);
        }
        if (dimension <= i || this.r0.findViewById(R.id.scrollview) != null) {
            return;
        }
        ScrollView scrollView2 = new ScrollView(getActivity());
        scrollView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        scrollView2.setId(R.id.scrollview);
        LinearLayout linearLayout2 = (LinearLayout) this.r0.findViewById(R.id.dialog_layout);
        RelativeLayout relativeLayout2 = (RelativeLayout) linearLayout2.findViewById(R.id.main_content);
        linearLayout2.removeView(relativeLayout2);
        scrollView2.addView(relativeLayout2);
        linearLayout2.addView(scrollView2);
    }

    public final void U0(PropertyModel propertyModel) {
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("WebNotesDynamicTemplates")) {
            return;
        }
        ((TextView) this.r0.findViewById(R.id.title)).setText(((NoteTemplate) propertyModel.i(AbstractC3763b62.c)).b);
    }

    @Override // androidx.fragment.app.c, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f11484J = true;
        if (this.z0) {
            V0();
            R0();
            ((RecyclerView) this.r0.findViewById(R.id.note_carousel)).r.t();
            S0();
            return;
        }
        L0(false, false);
    }
}
