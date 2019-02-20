package aapgsuez.net.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class EducationalInfo extends Fragment {

    Button next2;
    String faculty_str,department_str,year_str;

    public EducationalInfo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.educationalfragment, container, false);


        final Spinner faculty = (Spinner) rootview.findViewById(R.id.faculty);
        final Spinner department = (Spinner) rootview.findViewById(R.id.department);
        final Spinner year = (Spinner) rootview.findViewById(R.id.year);

        /*faculties*/
        ArrayAdapter facultyAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.faculty,
                android.R.layout.simple_spinner_dropdown_item);
        faculty.setAdapter(facultyAdapter);

        faculty.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                year.setVisibility(View.GONE);
                if (faculty.getSelectedItem().toString().equals("Choose your Faculty....")) {
                    Toast.makeText(getActivity(), "Choose your faculty..", Toast.LENGTH_SHORT).show();
                    department.setVisibility(View.GONE);
                    year.setVisibility(View.GONE);


                } else if (faculty.getSelectedItem().toString().equals("Petroleum and Mining Engineering")) {
                    department.setVisibility(View.VISIBLE);
                    year.setVisibility(View.GONE);
                    ArrayAdapter departmentAdapter = ArrayAdapter.createFromResource(getActivity(),
                            R.array.pme_department, android.R.layout.simple_spinner_dropdown_item);
                    department.setAdapter(departmentAdapter);

                    /*Science*/
                } else if (faculty.getSelectedItem().toString().equals("Science")) {
                    department.setVisibility(View.VISIBLE);
                    year.setVisibility(View.GONE);
                    ArrayAdapter departmentAdapter = ArrayAdapter.createFromResource(getActivity(),
                            R.array.departmentSC, android.R.layout.simple_spinner_dropdown_item);
                    department.setAdapter(departmentAdapter);


                } else if (faculty.getSelectedItem().toString().equals("Education")) {
                    department.setVisibility(View.VISIBLE);
                    year.setVisibility(View.GONE);
                    ArrayAdapter departmentAdapter = ArrayAdapter.createFromResource(getActivity(),
                            R.array.Education_departments, android.R.layout.simple_spinner_dropdown_item);
                    department.setAdapter(departmentAdapter);


                } else if (faculty.getSelectedItem().toString().equals("Arts and Humanities Science")) {
                    department.setVisibility(View.VISIBLE);
                    year.setVisibility(View.GONE);
                    ArrayAdapter departmentAdapter = ArrayAdapter.createFromResource(getActivity(),
                            R.array.Arts_department, android.R.layout.simple_spinner_dropdown_item);
                    year.setAdapter(departmentAdapter);


                } else if (faculty.getSelectedItem().toString().equals("Computers and Information")) {
                    department.setVisibility(View.GONE);
                    year.setVisibility(View.VISIBLE);
                    ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(getActivity(),
                            R.array.year4, android.R.layout.simple_spinner_dropdown_item);
                    year.setAdapter(yearAdapter);


                } else if (faculty.getSelectedItem().toString().equals("Economics and Politics Science")) {
                    department.setVisibility(View.GONE);
                    year.setVisibility(View.VISIBLE);
                    ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(getActivity(),
                            R.array.year4, android.R.layout.simple_spinner_dropdown_item);
                    year.setAdapter(yearAdapter);


                } else if (faculty.getSelectedItem().toString().equals("Fish Resources and Marine Studies")) {
                    department.setVisibility(View.VISIBLE);
                    year.setVisibility(View.GONE);
                    ArrayAdapter departmentAdapter = ArrayAdapter.createFromResource(getActivity(),
                            R.array.departmentfr, android.R.layout.simple_spinner_dropdown_item);
                    department.setAdapter(departmentAdapter);


                    /*Industrial Education*/
                } else if (faculty.getSelectedItem().toString().equals("Industrial Education")) {
                    department.setVisibility(View.GONE);
                    year.setVisibility(View.VISIBLE);
                    ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(getActivity(),
                            R.array.year4, android.R.layout.simple_spinner_dropdown_item);
                    year.setAdapter(yearAdapter);


                } else if (faculty.getSelectedItem().toString().equals("Commerce")) {
                    department.setVisibility(View.VISIBLE);
                    year.setVisibility(View.GONE);
                    ArrayAdapter departmentAdapter = ArrayAdapter.createFromResource(getActivity(),
                            R.array.commerce, android.R.layout.simple_spinner_dropdown_item);
                    department.setAdapter(departmentAdapter);

                }else if (faculty.getSelectedItem().toString().equals("Islamic and Arabic Studies")) {
                    department.setVisibility(View.VISIBLE);
                    year.setVisibility(View.GONE);
                    ArrayAdapter departmentAdapter = ArrayAdapter.createFromResource(getActivity(),
                            R.array.islamic, android.R.layout.simple_spinner_dropdown_item);
                    department.setAdapter(departmentAdapter);

                }else if (faculty.getSelectedItem().toString().equals("High Canal Institute for Technology and Engineering")) {
                    department.setVisibility(View.VISIBLE);
                    year.setVisibility(View.GONE);
                    ArrayAdapter departmentAdapter = ArrayAdapter.createFromResource(getActivity(),
                            R.array.ma3had, android.R.layout.simple_spinner_dropdown_item);
                    department.setAdapter(departmentAdapter);

                }else if (faculty.getSelectedItem().toString().equals("Suez Institute for Management")) {
                    department.setVisibility(View.VISIBLE);
                    year.setVisibility(View.GONE);
                    ArrayAdapter departmentAdapter = ArrayAdapter.createFromResource(getActivity(),
                            R.array.suezInstitutse, android.R.layout.simple_spinner_dropdown_item);
                    department.setAdapter(departmentAdapter);

                }else if (faculty.getSelectedItem().toString().equals("Other")) {
                    department.setVisibility(View.VISIBLE);
                    year.setVisibility(View.GONE);
                    ArrayAdapter departmentAdapter = ArrayAdapter.createFromResource(getActivity(),
                            R.array.other_department, android.R.layout.simple_spinner_dropdown_item);
                    department.setAdapter(departmentAdapter);

                }
            }

                @Override
                public void onNothingSelected (AdapterView < ? > parent){
                    department.setVisibility(View.GONE);
                }
            });

        /*departments*/
        department.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(
                            AdapterView<?> parent, View view, int position, long id) {
                        if (department.getSelectedItem().toString().equals("Choose your Department ....")) {
                            year.setVisibility(View.GONE);
                        } else
                            year.setVisibility(View.VISIBLE);
                        ArrayAdapter year4Adapter = ArrayAdapter.createFromResource(getActivity(),
                                R.array.year4, android.R.layout.simple_spinner_dropdown_item);
                        year.setAdapter(year4Adapter);


                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        year.setVisibility(View.GONE);
                    }
                });




        next2 = (Button)rootview.findViewById(R.id.next2);
        next2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                faculty_str = faculty.getSelectedItem().toString().trim();
                department_str = department.getSelectedItem().toString().trim();
                year_str = year.getSelectedItem().toString().trim();


            }
        });

        return rootview;
        }


    }
