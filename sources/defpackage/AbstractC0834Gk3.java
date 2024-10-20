package defpackage;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gk3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0834Gk3 {
    public static TextDirectionHeuristic a(DH3 dh3) {
        if (dh3 == GH3.a) {
            return TextDirectionHeuristics.LTR;
        }
        if (dh3 == GH3.b) {
            return TextDirectionHeuristics.RTL;
        }
        if (dh3 == GH3.c) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (dh3 == GH3.d) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (dh3 == GH3.e) {
            return TextDirectionHeuristics.ANYRTL_LTR;
        }
        if (dh3 == FH3.b) {
            return TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }
}
