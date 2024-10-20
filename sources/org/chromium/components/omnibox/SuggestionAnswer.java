package org.chromium.components.omnibox;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class SuggestionAnswer {
    public final int a;
    public final ImageLine b;
    public final ImageLine c;

    public SuggestionAnswer(int i, ImageLine imageLine, ImageLine imageLine2) {
        this.a = i;
        this.b = imageLine;
        this.c = imageLine2;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SuggestionAnswer)) {
            return false;
        }
        SuggestionAnswer suggestionAnswer = (SuggestionAnswer) obj;
        return this.a == suggestionAnswer.a && Objects.equals(this.b, suggestionAnswer.b) && Objects.equals(this.c, suggestionAnswer.c);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public final class ImageLine {
        public final List a;
        public final TextField b;
        public final TextField c;
        public final String d;

        public ImageLine(List list, TextField textField, TextField textField2, String str) {
            this.a = list;
            this.b = textField;
            this.c = textField2;
            this.d = str;
        }

        public final int hashCode() {
            return Arrays.deepHashCode(new Object[]{this.a.toArray(), this.b, this.c, this.d});
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ImageLine)) {
                return false;
            }
            ImageLine imageLine = (ImageLine) obj;
            List list = this.a;
            if (list.size() != imageLine.a.size()) {
                return false;
            }
            for (int i = 0; i < list.size(); i++) {
                if (!Objects.equals(list.get(i), imageLine.a.get(i))) {
                    return false;
                }
            }
            return TextUtils.equals(this.d, imageLine.d) && Objects.equals(this.b, imageLine.b) && Objects.equals(this.c, imageLine.c);
        }
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public final class TextField {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        public TextField(int i, String str, int i2, int i3) {
            this.a = i;
            this.b = str;
            this.c = i2;
            this.d = i3;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof TextField)) {
                return false;
            }
            TextField textField = (TextField) obj;
            return this.a == textField.a && TextUtils.equals(this.b, textField.b) && this.c == textField.c && this.d == textField.d;
        }
    }

    public static SuggestionAnswer createSuggestionAnswer(int i, ImageLine imageLine, ImageLine imageLine2) {
        return new SuggestionAnswer(i, imageLine, imageLine2);
    }

    public static ImageLine createImageLine(List list, TextField textField, TextField textField2, String str) {
        return new ImageLine(list, textField, textField2, str);
    }

    public static List createTextFieldList() {
        return new ArrayList();
    }

    public static void addTextFieldToList(List list, TextField textField) {
        list.add(textField);
    }

    public static TextField createTextField(int i, String str, int i2, int i3) {
        return new TextField(i, str, i2, i3);
    }
}
