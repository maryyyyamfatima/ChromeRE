package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import com.google.android.material.card.MaterialCardView;
import java.text.NumberFormat;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pH2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8633pH2 extends LinearLayout {
    public static final OL2 h;
    public C5050er3 a;
    public InterfaceC8290oH2 g;

    static {
        Integer valueOf = Integer.valueOf(R.drawable.f54100_resource_name_obfuscated_res_0x7f0904e0);
        Integer valueOf2 = Integer.valueOf(R.drawable.f46100_resource_name_obfuscated_res_0x7f090162);
        Integer valueOf3 = Integer.valueOf(R.drawable.f51750_resource_name_obfuscated_res_0x7f0903dd);
        Integer valueOf4 = Integer.valueOf(R.drawable.f53060_resource_name_obfuscated_res_0x7f090476);
        Integer valueOf5 = Integer.valueOf(R.drawable.f54110_resource_name_obfuscated_res_0x7f0904e1);
        C0172Bi1 c0172Bi1 = AbstractC0562Ei1.g;
        Object[] objArr = {valueOf, valueOf2, valueOf3, valueOf4, valueOf5};
        L82.a(5, objArr);
        h = AbstractC0562Ei1.m(5, objArr);
    }

    public C8633pH2(Context context) {
        super(context);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.f61160_resource_name_obfuscated_res_0x7f0e0298, (ViewGroup) this, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void f(C5050er3 c5050er3) {
        this.a = c5050er3;
        int i = c5050er3.k;
        if (i < 5 || i > 7) {
            throw new IllegalArgumentException("Number of ratings must be between 5 and 7.");
        }
        TextView textView = (TextView) findViewById(R.id.survey_rating_low_value_text);
        String str = c5050er3.m;
        textView.setText(str);
        textView.setContentDescription(str);
        TextView textView2 = (TextView) findViewById(R.id.survey_rating_high_value_text);
        String str2 = c5050er3.n;
        textView2.setText(str2);
        textView2.setContentDescription(str2);
        int i2 = c5050er3.j;
        char c = 2;
        ?? r6 = 0;
        char c2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? (char) 0 : (char) 4 : (char) 3 : (char) 2 : (char) 1;
        if (c2 == 0) {
            c2 = 5;
        }
        int i3 = R.layout.f61180_resource_name_obfuscated_res_0x7f0e029a;
        int i4 = R.id.survey_rating_image_icon;
        int i5 = R.id.survey_rating_image_layout;
        if (c2 == 2) {
            final ViewGroup viewGroup = (ViewGroup) findViewById(R.id.survey_rating_images_container);
            LayoutInflater from = LayoutInflater.from(getContext());
            OL2 ol2 = h;
            int i6 = ol2.i;
            final int i7 = 0;
            while (i7 < i6) {
                View inflate = from.inflate(i3, viewGroup, false);
                if (i7 == 0) {
                    inflate.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                }
                final FrameLayout frameLayout = (FrameLayout) inflate.findViewById(i5);
                final ImageView imageView = (ImageView) frameLayout.findViewById(i4);
                Context context = getContext();
                int intValue = ((Integer) ol2.get(i7)).intValue();
                Object obj = Y50.a;
                imageView.setImageDrawable(AbstractC3208Yr3.i(a(R.color.f26440_resource_name_obfuscated_res_0x7f07087e), getContext(), context.getDrawable(intValue)));
                i7++;
                imageView.setTag(Integer.valueOf(i7));
                d(imageView, i7, i6, 2);
                frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: hH2
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        C8633pH2 c8633pH2 = C8633pH2.this;
                        c8633pH2.getClass();
                        int action = motionEvent.getAction();
                        FrameLayout frameLayout2 = frameLayout;
                        ImageView imageView2 = imageView;
                        if (action == 0) {
                            if (!C8633pH2.b(view, motionEvent)) {
                                return true;
                            }
                            frameLayout2.setPressed(true);
                            Context context2 = c8633pH2.getContext();
                            int a = c8633pH2.a(R.color.f26320_resource_name_obfuscated_res_0x7f07086e);
                            int i8 = AbstractC3208Yr3.b;
                            Drawable drawable = imageView2.getDrawable();
                            if (drawable == null) {
                                return true;
                            }
                            imageView2.setImageDrawable(AbstractC3208Yr3.i(a, context2, drawable));
                            return true;
                        }
                        if (action == 1) {
                            if (!frameLayout2.isPressed()) {
                                return true;
                            }
                            frameLayout2.performClick();
                            return true;
                        }
                        if (action != 2) {
                            return false;
                        }
                        if (C8633pH2.b(view, motionEvent)) {
                            return true;
                        }
                        frameLayout2.setPressed(false);
                        Context context3 = c8633pH2.getContext();
                        int a2 = c8633pH2.a(R.color.f26440_resource_name_obfuscated_res_0x7f07087e);
                        int i9 = AbstractC3208Yr3.b;
                        Drawable drawable2 = imageView2.getDrawable();
                        if (drawable2 == null) {
                            return true;
                        }
                        imageView2.setImageDrawable(AbstractC3208Yr3.i(a2, context3, drawable2));
                        return true;
                    }
                });
                frameLayout.setOnClickListener(new View.OnClickListener() { // from class: iH2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        final C8633pH2 c8633pH2 = C8633pH2.this;
                        c8633pH2.getClass();
                        C8633pH2.c(viewGroup);
                        Handler handler = new Handler();
                        final int i8 = i7;
                        handler.postDelayed(new Runnable() { // from class: mH2
                            @Override // java.lang.Runnable
                            public final void run() {
                                C8633pH2 c8633pH22 = C8633pH2.this;
                                InterfaceC8290oH2 interfaceC8290oH2 = c8633pH22.g;
                                if (interfaceC8290oH2 != null) {
                                    interfaceC8290oH2.a(i8);
                                    c8633pH22.g = null;
                                }
                            }
                        }, 250L);
                    }
                });
                viewGroup.addView(inflate);
                i3 = R.layout.f61180_resource_name_obfuscated_res_0x7f0e029a;
                i4 = R.id.survey_rating_image_icon;
                i5 = R.id.survey_rating_image_layout;
            }
            return;
        }
        char c3 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? (char) 0 : (char) 4 : (char) 3 : (char) 2 : (char) 1;
        if (c3 == 0) {
            c3 = 5;
        }
        if (c3 == 4) {
            final ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.survey_rating_images_container);
            LayoutInflater from2 = LayoutInflater.from(getContext());
            int i8 = this.a.k;
            final int i9 = 0;
            while (i9 < i8) {
                View inflate2 = from2.inflate(R.layout.f61190_resource_name_obfuscated_res_0x7f0e029b, viewGroup2, false);
                if (i9 == 0) {
                    inflate2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                }
                final FrameLayout frameLayout2 = (FrameLayout) inflate2.findViewById(R.id.survey_rating_number_layout);
                int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.f40840_resource_name_obfuscated_res_0x7f08076d);
                viewGroup2.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
                final MaterialCardView materialCardView = (MaterialCardView) frameLayout2.findViewById(R.id.survey_rating_number_card);
                int dimension = (int) getResources().getDimension(R.dimen.f40850_resource_name_obfuscated_res_0x7f08076e);
                ViewGroup.LayoutParams layoutParams = materialCardView.getLayoutParams();
                layoutParams.width = dimension;
                layoutParams.height = dimension;
                materialCardView.setLayoutParams(layoutParams);
                final TextView textView3 = (TextView) materialCardView.findViewById(R.id.survey_rating_number_text);
                i9++;
                textView3.setTag(Integer.valueOf(i9));
                textView3.setText(String.valueOf(i9));
                d(textView3, i9, i8, 4);
                frameLayout2.setOnTouchListener(new View.OnTouchListener() { // from class: fH2
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        C8633pH2 c8633pH2 = C8633pH2.this;
                        c8633pH2.getClass();
                        int action = motionEvent.getAction();
                        FrameLayout frameLayout3 = frameLayout2;
                        MaterialCardView materialCardView2 = materialCardView;
                        TextView textView4 = textView3;
                        if (action == 0) {
                            if (!C8633pH2.b(view, motionEvent)) {
                                return true;
                            }
                            frameLayout3.setPressed(true);
                            int a = c8633pH2.a(R.color.f26320_resource_name_obfuscated_res_0x7f07086e);
                            materialCardView2.getClass();
                            materialCardView2.l.c.j(ColorStateList.valueOf(a));
                            textView4.setTextColor(c8633pH2.a(R.color.f26550_resource_name_obfuscated_res_0x7f070889));
                            return true;
                        }
                        if (action == 1) {
                            if (!frameLayout3.isPressed()) {
                                return true;
                            }
                            frameLayout3.performClick();
                            return true;
                        }
                        if (action != 2) {
                            return false;
                        }
                        if (C8633pH2.b(view, motionEvent)) {
                            return true;
                        }
                        frameLayout3.setPressed(false);
                        int a2 = c8633pH2.a(R.color.f22100_resource_name_obfuscated_res_0x7f070577);
                        materialCardView2.getClass();
                        materialCardView2.l.c.j(ColorStateList.valueOf(a2));
                        textView4.setTextColor(c8633pH2.a(R.color.f26500_resource_name_obfuscated_res_0x7f070884));
                        return true;
                    }
                });
                frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: gH2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        final C8633pH2 c8633pH2 = C8633pH2.this;
                        c8633pH2.getClass();
                        C8633pH2.c(viewGroup2);
                        Handler handler = new Handler();
                        final int i10 = i9;
                        handler.postDelayed(new Runnable() { // from class: lH2
                            @Override // java.lang.Runnable
                            public final void run() {
                                C8633pH2 c8633pH22 = C8633pH2.this;
                                InterfaceC8290oH2 interfaceC8290oH2 = c8633pH22.g;
                                if (interfaceC8290oH2 != null) {
                                    interfaceC8290oH2.a(i10);
                                    c8633pH22.g = null;
                                }
                            }
                        }, 250L);
                    }
                });
                viewGroup2.addView(inflate2);
            }
            return;
        }
        if (i2 == 0) {
            c = 1;
        } else if (i2 != 1) {
            c = i2 != 2 ? i2 != 3 ? (char) 0 : (char) 4 : (char) 3;
        }
        if ((c != 0 ? c : (char) 5) == 3) {
            int a = a(R.color.f26320_resource_name_obfuscated_res_0x7f07086e);
            int a2 = a(R.color.f26440_resource_name_obfuscated_res_0x7f07087e);
            Context context2 = getContext();
            Object obj2 = Y50.a;
            final Drawable i10 = AbstractC3208Yr3.i(a2, getContext(), context2.getDrawable(R.drawable.f52750_resource_name_obfuscated_res_0x7f090454));
            final Drawable i11 = AbstractC3208Yr3.i(a, getContext(), getContext().getDrawable(R.drawable.f52760_resource_name_obfuscated_res_0x7f090455));
            final ViewGroup viewGroup3 = (ViewGroup) findViewById(R.id.survey_rating_images_container);
            LayoutInflater from3 = LayoutInflater.from(getContext());
            int i12 = this.a.k;
            final int i13 = 0;
            while (i13 < i12) {
                View inflate3 = from3.inflate(R.layout.f61180_resource_name_obfuscated_res_0x7f0e029a, viewGroup3, (boolean) r6);
                if (i13 == 0) {
                    inflate3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                }
                final FrameLayout frameLayout3 = (FrameLayout) inflate3.findViewById(R.id.survey_rating_image_layout);
                int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.f40830_resource_name_obfuscated_res_0x7f08076c);
                viewGroup3.setPadding(dimensionPixelOffset2, r6, dimensionPixelOffset2, r6);
                ImageView imageView2 = (ImageView) frameLayout3.findViewById(R.id.survey_rating_image_icon);
                imageView2.setImageDrawable(i10);
                i13++;
                imageView2.setTag(Integer.valueOf(i13));
                d(imageView2, i13, i12, 3);
                frameLayout3.setOnTouchListener(new View.OnTouchListener() { // from class: jH2
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        int action = motionEvent.getAction();
                        FrameLayout frameLayout4 = frameLayout3;
                        ViewGroup viewGroup4 = viewGroup3;
                        Drawable drawable = i10;
                        Drawable drawable2 = i11;
                        int i14 = i13;
                        if (action == 0) {
                            if (!C8633pH2.b(view, motionEvent)) {
                                return true;
                            }
                            frameLayout4.setPressed(true);
                            C8633pH2.e(viewGroup4, i14, drawable, drawable2);
                            return true;
                        }
                        if (action == 1) {
                            if (!frameLayout4.isPressed()) {
                                return true;
                            }
                            frameLayout4.performClick();
                            C8633pH2.e(viewGroup4, i14, drawable, drawable2);
                            return true;
                        }
                        if (action != 2) {
                            return false;
                        }
                        if (C8633pH2.b(view, motionEvent)) {
                            return true;
                        }
                        frameLayout4.setPressed(false);
                        C8633pH2.e(viewGroup4, 0, drawable, drawable2);
                        return true;
                    }
                });
                frameLayout3.setOnClickListener(new View.OnClickListener() { // from class: kH2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        final C8633pH2 c8633pH2 = C8633pH2.this;
                        c8633pH2.getClass();
                        C8633pH2.c(viewGroup3);
                        Handler handler = new Handler();
                        final int i14 = i13;
                        handler.postDelayed(new Runnable() { // from class: nH2
                            @Override // java.lang.Runnable
                            public final void run() {
                                C8633pH2 c8633pH22 = C8633pH2.this;
                                InterfaceC8290oH2 interfaceC8290oH2 = c8633pH22.g;
                                if (interfaceC8290oH2 != null) {
                                    interfaceC8290oH2.a(i14);
                                    c8633pH22.g = null;
                                }
                            }
                        }, 250L);
                    }
                });
                viewGroup3.addView(inflate3);
                r6 = 0;
            }
        }
    }

    public static boolean b(View view, MotionEvent motionEvent) {
        return motionEvent.getX() >= 0.0f && motionEvent.getX() < ((float) view.getWidth()) && motionEvent.getY() >= 0.0f && motionEvent.getY() < ((float) view.getHeight());
    }

    public final int a(int i) {
        Context context = getContext();
        Object obj = Y50.a;
        return context.getColor(i);
    }

    public static void e(ViewGroup viewGroup, int i, Drawable drawable, Drawable drawable2) {
        int i2 = 0;
        while (i2 < viewGroup.getChildCount()) {
            ((ImageView) viewGroup.getChildAt(i2).findViewById(R.id.survey_rating_image_icon)).setImageDrawable(i2 >= i ? drawable : drawable2);
            i2++;
        }
    }

    public static void c(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            viewGroup.getChildAt(i).setOnClickListener(null);
            viewGroup.getChildAt(i).setClickable(false);
        }
    }

    public final void d(View view, int i, int i2, int i3) {
        Locale locale;
        String string;
        LocaleList locales;
        Context context = getContext();
        if (Build.VERSION.SDK_INT >= 24) {
            locales = context.getResources().getConfiguration().getLocales();
            locale = locales.get(0);
        } else {
            locale = context.getResources().getConfiguration().locale;
        }
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        String format = numberFormat.format(i);
        String format2 = numberFormat.format(i2);
        String string2 = getContext().getString(R.string.f87900_resource_name_obfuscated_res_0x7f140ab5, format, format2);
        if (i3 == 3) {
            string2 = getResources().getQuantityString(R.plurals.f62760_resource_name_obfuscated_res_0x7f120037, i, Integer.valueOf(i), Integer.valueOf(i2));
        }
        if (i == 1) {
            string2 = AbstractC8192o0.a(string2, " ", this.a.m);
        } else if (i == i2) {
            string2 = AbstractC8192o0.a(string2, " ", this.a.n);
        }
        if (i3 == 2) {
            Context context2 = getContext();
            Object[] objArr = new Object[3];
            objArr[0] = format;
            objArr[1] = format2;
            if (i == 1) {
                string = getContext().getString(R.string.f88120_resource_name_obfuscated_res_0x7f140acb);
            } else if (i == 2) {
                string = getContext().getString(R.string.f88030_resource_name_obfuscated_res_0x7f140ac2);
            } else if (i == 3) {
                string = getContext().getString(R.string.f87880_resource_name_obfuscated_res_0x7f140ab3);
            } else if (i == 4) {
                string = getContext().getString(R.string.f88040_resource_name_obfuscated_res_0x7f140ac3);
            } else {
                string = i != 5 ? "" : getContext().getString(R.string.f88130_resource_name_obfuscated_res_0x7f140acc);
            }
            objArr[2] = string;
            string2 = context2.getString(R.string.f88020_resource_name_obfuscated_res_0x7f140ac1, objArr);
        }
        view.setContentDescription(string2);
    }
}
