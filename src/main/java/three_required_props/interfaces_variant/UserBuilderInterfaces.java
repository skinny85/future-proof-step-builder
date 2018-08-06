package three_required_props.interfaces_variant;

import three_required_props.User;

public interface UserBuilderInterfaces {
    interface StarterBuilderInterf {
        B_1_Interf email(String email);
        StarterBuilderInterf username(String username);
        B_2_Interf firstName(String firstName);
        B_3_Interf lastName(String lastName);
        StarterBuilderInterf displayName(String displayName);
    }

    interface B_1_Interf {
        B_1_Interf email(String email);
        B_1_Interf username(String username);
        B_1_2_Interf firstName(String firstName);
        B_1_3_Interf lastName(String lastName);
        B_1_Interf displayName(String displayName);
    }

    interface B_2_Interf {
        B_1_2_Interf email(String email);
        B_2_Interf username(String username);
        B_2_Interf firstName(String firstName);
        B_2_3_Interf lastName(String lastName);
        B_2_Interf displayName(String displayName);
    }

    interface B_3_Interf {
        B_1_3_Interf email(String email);
        B_3_Interf username(String username);
        B_2_3_Interf firstName(String firstName);
        B_3_Interf lastName(String lastName);
        B_3_Interf displayName(String displayName);
    }

    interface B_1_2_Interf {
        B_1_2_Interf email(String email);
        B_1_2_Interf username(String username);
        B_1_2_Interf firstName(String firstName);
        FinalBuilderInterf lastName(String lastName);
        B_1_2_Interf displayName(String displayName);
    }

    interface B_1_3_Interf {
        B_1_3_Interf email(String email);
        B_1_3_Interf username(String username);
        FinalBuilderInterf firstName(String firstName);
        B_1_3_Interf lastName(String lastName);
        B_1_3_Interf displayName(String displayName);
    }

    interface B_2_3_Interf {
        FinalBuilderInterf email(String email);
        B_2_3_Interf username(String username);
        B_2_3_Interf firstName(String firstName);
        B_2_3_Interf lastName(String lastName);
        B_2_3_Interf displayName(String displayName);
    }

    interface FinalBuilderInterf extends
            StarterBuilderInterf,
            B_1_Interf,
            B_2_Interf,
            B_3_Interf,
            B_1_2_Interf,
            B_1_3_Interf,
            B_2_3_Interf {
        FinalBuilderInterf email(String email);
        FinalBuilderInterf username(String username);
        FinalBuilderInterf firstName(String firstName);
        FinalBuilderInterf lastName(String lastName);
        FinalBuilderInterf displayName(String displayName);
        User build();
    }
}
