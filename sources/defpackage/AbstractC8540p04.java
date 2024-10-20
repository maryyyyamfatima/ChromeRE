package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.StrictMode;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: p04, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8540p04 {
    public static final HashMap a;
    public static Boolean b;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("xiaomi", 24);
        hashMap.put("htc", 26);
    }

    public static int f(ViewGroup viewGroup, View view, View view2, boolean z) {
        int indexOfChild = viewGroup.indexOfChild(view);
        if (indexOfChild >= 0) {
            return indexOfChild;
        }
        int indexOfChild2 = viewGroup.indexOfChild(view2);
        if (indexOfChild2 < 0) {
            return -1;
        }
        if (z) {
            indexOfChild2++;
        }
        viewGroup.addView(view, indexOfChild2);
        return indexOfChild2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009d, code lost:            return r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:            if (r0 != false) goto L25;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap b(android.view.View r13, int r14, android.graphics.Bitmap.Config r15) {
        /*
            boolean r0 = r13.isDrawingCacheEnabled()
            r1 = 1
            r2 = 0
            r3 = 0
            h(r13, r1)     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            if (r0 != 0) goto Lf
            r13.setDrawingCacheEnabled(r1)     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
        Lf:
            android.graphics.Bitmap r4 = r13.getDrawingCache()     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            if (r4 == 0) goto L48
            int r5 = r4.getHeight()     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            double r5 = (double) r5     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            int r7 = r4.getWidth()     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            double r7 = (double) r7     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            int r9 = (int) r7     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            int r10 = (int) r5     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            if (r14 <= 0) goto L36
            double r9 = (double) r14     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            double r11 = java.lang.Math.max(r7, r5)     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            double r9 = r9 / r11
            double r7 = r7 * r9
            long r7 = java.lang.Math.round(r7)     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            int r14 = (int) r7     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            double r5 = r5 * r9
            long r5 = java.lang.Math.round(r5)     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            int r10 = (int) r5     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            r9 = r14
        L36:
            android.graphics.Bitmap r14 = android.graphics.Bitmap.createScaledBitmap(r4, r9, r10, r1)     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            android.graphics.Bitmap$Config r1 = r14.getConfig()     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            if (r1 == r15) goto L8a
            android.graphics.Bitmap r3 = r14.copy(r15, r2)     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            r14.recycle()     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            goto L8b
        L48:
            int r1 = r13.getMeasuredHeight()     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            if (r1 <= 0) goto L8b
            int r1 = r13.getMeasuredWidth()     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            if (r1 <= 0) goto L8b
            int r1 = r13.getMeasuredHeight()     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            double r4 = (double) r1     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            int r1 = r13.getMeasuredWidth()     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            double r6 = (double) r1     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            int r1 = (int) r6     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            int r8 = (int) r4     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            if (r14 <= 0) goto L75
            double r8 = (double) r14     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            double r10 = java.lang.Math.max(r6, r4)     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            double r8 = r8 / r10
            double r10 = r6 * r8
            long r10 = java.lang.Math.round(r10)     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            int r1 = (int) r10     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            double r8 = r8 * r4
            long r8 = java.lang.Math.round(r8)     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
        L75:
            android.graphics.Bitmap r14 = android.graphics.Bitmap.createBitmap(r1, r8, r15)     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            android.graphics.Canvas r15 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            r15.<init>(r14)     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            double r9 = (double) r1     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            double r9 = r9 / r6
            float r1 = (float) r9     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            double r6 = (double) r8     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            double r6 = r6 / r4
            float r4 = (float) r6     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            r15.scale(r1, r4)     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
            r13.draw(r15)     // Catch: java.lang.Throwable -> L94 java.lang.OutOfMemoryError -> L96
        L8a:
            r3 = r14
        L8b:
            if (r0 != 0) goto L90
        L8d:
            r13.setDrawingCacheEnabled(r2)
        L90:
            h(r13, r2)
            goto L9d
        L94:
            r14 = move-exception
            goto L9e
        L96:
            r14 = move-exception
            r14.getMessage()     // Catch: java.lang.Throwable -> L94
            if (r0 != 0) goto L90
            goto L8d
        L9d:
            return r3
        L9e:
            if (r0 != 0) goto La3
            r13.setDrawingCacheEnabled(r2)
        La3:
            h(r13, r2)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8540p04.b(android.view.View, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    public static void h(View view, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), z);
            }
            return;
        }
        if (view instanceof SurfaceView) {
            view.setWillNotDraw(!z);
        }
    }

    public static File c(Context context) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            File file = new File(context.getFilesDir(), "images");
            if (!file.exists() && !file.mkdir()) {
                throw new IOException("Folder cannot be created.");
            }
            return file;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static void i(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeView(view);
    }

    public static int a(ListAdapter listAdapter, ListView listView) {
        View view;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(-2, -2);
        View[] viewArr = new View[listAdapter.getViewTypeCount()];
        int i = 0;
        for (int i2 = 0; i2 < listAdapter.getCount(); i2++) {
            int itemViewType = listAdapter.getItemViewType(i2);
            if (itemViewType < 0) {
                view = listAdapter.getView(i2, null, listView);
            } else {
                View view2 = listAdapter.getView(i2, viewArr[itemViewType], listView);
                viewArr[itemViewType] = view2;
                view = view2;
            }
            view.setLayoutParams(layoutParams);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i = Math.max(i, view.getMeasuredWidth());
        }
        return i;
    }

    public static Drawable d(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (typedArray == null || (resourceId = typedArray.getResourceId(i, -1)) == -1) {
            return null;
        }
        return AbstractC2884Wf.a(context, resourceId);
    }

    public static Drawable e(int i, int i2, Context context) {
        Drawable mutate = AbstractC2884Wf.a(context, i).mutate();
        mutate.setTintList(Y50.b(context, i2));
        return mutate;
    }

    public static boolean g() {
        if (b == null) {
            b = Boolean.FALSE;
            HashMap hashMap = a;
            String str = Build.MANUFACTURER;
            Locale locale = Locale.US;
            if (hashMap.containsKey(str.toLowerCase(locale))) {
                b = Boolean.valueOf(Build.VERSION.SDK_INT < ((Integer) hashMap.get(str.toLowerCase(locale))).intValue());
            }
        }
        return b.booleanValue();
    }

    public static void j(View view, boolean z) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        int systemUiVisibility = view.getSystemUiVisibility();
        view.setSystemUiVisibility(z ? systemUiVisibility | 16 : systemUiVisibility & (-17));
    }
}
