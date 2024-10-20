package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.ArrowKeyMovementMethod;
import android.text.method.MovementMethod;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class NI3 {
    public static final ColorDrawable a;
    public static final ColorStateList b;
    public static final ColorStateList c;
    public static final String d;
    public static final String e;
    public static final ColorDrawable f;
    public static final Typeface g;
    public static final MovementMethod h;
    public static final Rect i;
    public static final InputFilter[] j;

    static {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        a = colorDrawable;
        b = ColorStateList.valueOf(-16777216);
        c = ColorStateList.valueOf(-3355444);
        d = "";
        e = "";
        f = colorDrawable;
        g = Typeface.DEFAULT;
        h = ArrowKeyMovementMethod.getInstance();
        i = new Rect();
        j = new InputFilter[0];
    }

    public static void b(C7849n00 c7849n00, EditText editText, CharSequence charSequence, Drawable drawable, int i2, ColorStateList colorStateList, ColorStateList colorStateList2, Integer num, int i3, Typeface typeface, int i4, int i5, boolean z, int i6, int i7, int i8, List list, boolean z2, TextUtils.TruncateAt truncateAt, int i9, int i10, int i11, MovementMethod movementMethod, CharSequence charSequence2, boolean z3, int i12) {
        int i13;
        Drawable textCursorDrawable;
        if (i3 == -1) {
            editText.setTextSize(2, 14.0f);
        } else {
            editText.setTextSize(0, i3);
        }
        if (z2) {
            i13 = i6 | 131073;
            editText.setMinLines(i9);
            editText.setMaxLines(i10);
        } else {
            i13 = i6 & (-131073);
            editText.setLines(1);
        }
        if (!z) {
            i13 = 0;
        }
        if (i7 != 0) {
            editText.setRawInputType(i7);
        } else if (i13 != editText.getInputType()) {
            editText.setInputType(i13);
        }
        if (list != null) {
            editText.setFilters((InputFilter[]) list.toArray(new InputFilter[list.size()]));
        } else {
            editText.setFilters(j);
        }
        editText.setHint(charSequence);
        int i14 = Build.VERSION.SDK_INT;
        editText.setBackground(drawable);
        if (drawable == null || !drawable.getPadding(i)) {
            editText.setPadding(0, 0, 0, 0);
        }
        editText.setShadowLayer(0.0f, 0.0f, 0.0f, i2);
        editText.setTypeface(typeface, 0);
        editText.setGravity(i5);
        editText.setFocusable(z);
        editText.setFocusableInTouchMode(z);
        editText.setLongClickable(z);
        editText.setCursorVisible(z);
        editText.setTextColor(colorStateList);
        editText.setHintTextColor(colorStateList2);
        if (num != null) {
            editText.setHighlightColor(num.intValue());
        }
        editText.setMovementMethod(movementMethod);
        int imeOptions = editText.getImeOptions();
        editText.setImeOptions(i8);
        if (imeOptions != i8) {
            ((InputMethodManager) c7849n00.a.getSystemService("input_method")).restartInput(editText);
        }
        editText.setError(null, null);
        if (i11 != -1) {
            if (i14 >= 29) {
                editText.setTextCursorDrawable(i11);
            } else {
                try {
                    Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                    declaredField.setAccessible(true);
                    declaredField.set(editText, Integer.valueOf(i11));
                } catch (Exception unused) {
                }
            }
        }
        editText.setEllipsize(truncateAt);
        int i15 = Build.VERSION.SDK_INT;
        editText.setTextAlignment(i4);
        if (charSequence2 != null && !Objects.equals(editText.getText().toString(), charSequence2.toString())) {
            editText.setText(charSequence2);
            if (!z3) {
                editText.setSelection(editText.getText().toString().length());
            }
        }
        if (i12 != 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN);
            if (i15 >= 29) {
                textCursorDrawable = editText.getTextCursorDrawable();
                textCursorDrawable.setColorFilter(porterDuffColorFilter);
                editText.setTextCursorDrawable(textCursorDrawable);
            } else {
                try {
                    Field declaredField2 = TextView.class.getDeclaredField("mCursorDrawableRes");
                    declaredField2.setAccessible(true);
                    int i16 = declaredField2.getInt(editText);
                    Field declaredField3 = TextView.class.getDeclaredField("mEditor");
                    declaredField3.setAccessible(true);
                    Object obj = declaredField3.get(editText);
                    Context context = editText.getContext();
                    Object obj2 = Y50.a;
                    Drawable drawable2 = context.getDrawable(i16);
                    drawable2.setColorFilter(porterDuffColorFilter);
                    Drawable[] drawableArr = {drawable2, drawable2};
                    Field declaredField4 = obj.getClass().getDeclaredField("mCursorDrawable");
                    declaredField4.setAccessible(true);
                    declaredField4.set(obj, drawableArr);
                } catch (Exception unused2) {
                }
            }
            ColorStateList valueOf = ColorStateList.valueOf(i12);
            WeakHashMap weakHashMap = Ec4.a;
            editText.setBackgroundTintList(valueOf);
        }
    }

    public static Drawable a(C7849n00 c7849n00, Drawable drawable) {
        if (drawable != a) {
            return drawable;
        }
        TypedArray obtainStyledAttributes = c7849n00.a.obtainStyledAttributes(null, new int[]{R.attr.background}, R.attr.editTextStyle, 0);
        Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable2;
    }
}
